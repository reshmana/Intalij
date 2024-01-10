package com.xworkz.costumdatatype.reshma.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor

public class CoverDTO implements Serializable {
    private String name;
    private double cost;
    private boolean original;
    private  int thickness;
}
