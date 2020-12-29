package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootLearningApplication {

    public static void main(String[] args) {

       ConfigurableApplicationContext context= SpringApplication.run(SpringBootLearningApplication.class, args);
//        System.out.println("Hello World");
        Alien a=context.getBean(Alien.class);
        a.show();
//        Laptop m=context.getBean(Laptop.class);
//        m.compile();
    }

}
