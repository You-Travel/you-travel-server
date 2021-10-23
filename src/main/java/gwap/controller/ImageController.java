package gwap.controller;

import gwap.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

@RestController
public class ImageController {
    private FileStorageService fileStorageService = new FileStorageService();


    @GetMapping("/files/{filename:.+}")
    public ResponseEntity<Resource> getFile(@PathVariable("filename")String filename){
        System.out.println("111111111111111");
        Resource file = fileStorageService.load(filename);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment;filename=\""+file.getFilename()+"\"")
                .body(file);


    }
}
