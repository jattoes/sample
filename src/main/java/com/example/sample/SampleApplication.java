package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SampleApplication {
    public static void main(String[] args) {
       SpringApplication.run(SampleApplication.class, args);

        System.out.println("Main -> " + Thread.currentThread().getName());
    }
}
