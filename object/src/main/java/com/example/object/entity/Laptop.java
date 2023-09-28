package com.example.object.entity;

import com.example.object.model.LaptopDto;
import com.example.object.model.LaptopForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Laptop {
    private Long id;
    private String model;
    private String company;

    public static Laptop ofModelNameAndCompany (
        String modelName, String company
    ) {
        Laptop laptop = new Laptop();
        laptop.company = company;
        laptop.model = modelName;
        return laptop;
    }

    public static Laptop from(LaptopForm laptopForm) {
        Laptop laptop = new Laptop();
        laptop.model = laptopForm.getName();
        laptop.company = laptopForm.getCorp();
        return laptop;
    }
}
