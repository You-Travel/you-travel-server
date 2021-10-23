package gwap.dataSource;


import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;

import java.io.IOException;


public class DataSource {
    public static Content getAirplanes() throws IOException{
        return Request
                .Post("https://hotels4.p.rapidapi.com/locations/search?query=new%20york&locale=en_US")
                .execute().returnContent();
    }

    public static Content getTraines() throws IOException{
        return Request
                .Post("https://hotels4.p.rapidapi.com/locations/search?query=new%20york&locale=en_US")
                .execute().returnContent();
    }

    public static Content getAuto() throws IOException{
        return Request
                .Post("https://hotels4.p.rapidapi.com/locations/search?query=new%20york&locale=en_US")
                .execute().returnContent();
    }

}
