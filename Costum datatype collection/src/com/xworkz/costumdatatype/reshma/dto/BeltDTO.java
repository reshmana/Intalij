package com.xworkz.costumdatatype.reshma.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor

public class BeltDTO implements Serializable {
    private String material;
    private int length;
    private String buckleType;
    private String color;
}
