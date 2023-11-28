package com.upc.pc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Pc2Application {

    public static void main(String[] args) {
        SpringApplication.run(Pc2Application.class, args);
    }

}
