package com.example.object.model;

import com.example.object.entity.Laptop;
import java.util.Objects;
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

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LaptopDto laptopDto = (LaptopDto) obj;
        return Objects.equals(modelName, laptopDto.modelName) &&
            Objects.equals(company, laptopDto.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, company);
    }

}
