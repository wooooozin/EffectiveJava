package com.example.object;

import com.example.object.entity.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObjectApplication.class, args);
        System.out.println(new Laptop(1L, "gram", "samsung"));
    }

}
