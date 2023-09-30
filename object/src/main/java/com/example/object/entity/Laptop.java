package com.example.object.entity;

import com.example.object.model.LaptopForm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Laptop {
    @ToString.Exclude
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
