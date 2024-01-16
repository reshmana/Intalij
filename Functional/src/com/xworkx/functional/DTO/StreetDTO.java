package com.xworkx.functional.DTO;

import lombok.*;

import java.io.Serializable;
@NoArgsConstructor@AllArgsConstructor@ToString@Setter@Getter

public class StreetDTO implements Serializable {
    private String streetName;
    private double length;
    private int numberOfLanes;
    private boolean Residential;
}
