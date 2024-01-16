package com.xworkx.functional.DTO;

import lombok.*;

import java.io.Serializable;
@AllArgsConstructor@NoArgsConstructor@ToString@Setter@Getter

public class GeyserDTO implements Serializable {
    private String brand;
    private String color;
    private double temperature;
    private double pressure;

}
