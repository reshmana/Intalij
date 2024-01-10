package com.xworkz.costumdatatype.reshma.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor

public class ParkingDTO implements Serializable {
    private int spotNumber;
    private String occupied;
    private double  NOOfoVehicle;
    private String Vehicletype;
}
