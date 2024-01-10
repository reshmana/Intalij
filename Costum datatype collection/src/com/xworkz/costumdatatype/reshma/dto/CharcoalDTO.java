package com.xworkz.costumdatatype.reshma.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor

public class CharcoalDTO implements Serializable {
    private double porosity;
    private boolean carbonContent;
    private int ashContent;
    private double heatOutput;
}
