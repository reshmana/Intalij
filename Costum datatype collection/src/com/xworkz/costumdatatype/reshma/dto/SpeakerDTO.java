package com.xworkz.costumdatatype.reshma.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString

public class SpeakerDTO implements Serializable {
    private String brand;
    private String model;
    private int powerRating;  // in watts
    private boolean wireless;
}
