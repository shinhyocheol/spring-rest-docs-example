package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringRestDocsExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestDocsExampleApplication.class, args);
    }

}
