package gwap.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication
@Configuration
@ComponentScan({"gwap.controller", "gwap.model"})
public class ServerApplication {

	@RequestMapping(value = "/")
	public String home() {
		return "Hello Docker World";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		factory.setMaxFileSize(DataSize.parse("128KB"));
		factory.setMaxRequestSize(DataSize.parse("128KB"));
		return factory.createMultipartConfig();
	}

}