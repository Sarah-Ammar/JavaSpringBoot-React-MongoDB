package com.example.first_artifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//this annotation is related to line 16-20@RestController
//the equivalent name of this class is MoviesApplication
public class FirstArtifactApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstArtifactApplication.class, args);
    }
//Instead of the following endpoint, the application will be divided into different layers: service, data access, and api layers.
//    @GetMapping("/")
//    public String apiRoot() {
//        return "hola d";
//    }
}
