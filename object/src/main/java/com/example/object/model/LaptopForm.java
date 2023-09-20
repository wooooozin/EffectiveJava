package com.example.object.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LaptopForm {
    private String name;
    private String corp;

    public String getName() {
        return name;
    }

    public String getCorp() {
        return corp;
    }
}
