package com.xworkz.costumdatatype.reshma.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor

public class RifillDTO implements Serializable {
    private String inkColor;
    private int inkVolume;
    private String brand;
    private boolean compatible;
}
