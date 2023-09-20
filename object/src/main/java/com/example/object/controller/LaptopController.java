package com.example.object.controller;

import com.example.object.model.LaptopForm;
import com.example.object.model.LaptopDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {

    @PostMapping("/add")
    public LaptopDto addLaptop(
        @RequestBody LaptopForm laptopForm
    ) {
        return null;
    }

}
