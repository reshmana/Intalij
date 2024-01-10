package com.xworkz.costumdatatype.reshma.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor

public class SparkPlugDTO implements Serializable {
    private String type;
    private String material;
    private int voltage;
    private boolean reliable;
}
