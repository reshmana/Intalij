package com.Xworkz.streams.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString

public class MedicineDTO implements Serializable {

    private  String name;
    private String id;
    private String company;
    private LocalDate expiryDate;
    private LocalDate manFDate;
    private double cost;
    private String[] ingredients;

}
