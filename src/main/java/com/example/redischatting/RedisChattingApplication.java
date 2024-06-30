package com.example.redischatting;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisChattingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RedisChattingApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("appliction started");
    }
}
