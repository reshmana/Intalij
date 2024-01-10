package com.xworkz.costumdatatype.reshma.dto;

import lombok.*;

import java.io.Serializable;
 @Getter
 @Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class PaperDTO implements Serializable {

    private double weight;
    private double width;
    private boolean landscape;
    private String type;
}