package com.example.redischatting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class RedisChattingApplication implements CommandLineRunner {

    @Autowired
    private  ChatService chatService;


    public static void main(String[] args) {
        SpringApplication.run(RedisChattingApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("appliction started");
        chatService.enterCharRoom("ch1");
    }
}
