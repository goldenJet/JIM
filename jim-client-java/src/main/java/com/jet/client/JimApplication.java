package com.jet.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JimApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JimApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

}
