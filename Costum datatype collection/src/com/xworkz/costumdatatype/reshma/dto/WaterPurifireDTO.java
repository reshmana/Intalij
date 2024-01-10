package com.xworkz.costumdatatype.reshma.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor

public class WaterPurifireDTO implements Serializable {
    private String model;
    private int filtrationCapacity;
    private String purificationTechnology;
    private boolean smartFeatures;
}
