package com.xworkx.functional.DTO;

import lombok.*;

import java.io.Serializable;
@Setter@ToString@NoArgsConstructor@AllArgsConstructor@Getter

public class ThermometerDTO implements Serializable {
    private String brand;
    private String temperatureUnit;
    private double currentTemperature;
    private boolean isDigital;
}
