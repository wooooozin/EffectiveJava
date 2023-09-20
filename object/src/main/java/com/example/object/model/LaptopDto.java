package com.example.object.model;

import com.example.object.entity.Laptop;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LaptopDto {

    String modelName;
    String company;

    public static LaptopDto from(Laptop laptop) {
        LaptopDto laptopDto = new LaptopDto();
        laptopDto.company = laptop.getCompany();
        laptopDto.modelName = laptop.getModel();
        return laptopDto;
    }

}
