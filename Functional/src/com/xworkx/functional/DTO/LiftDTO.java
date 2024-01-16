package com.xworkx.functional.DTO;

import lombok.*;

import java.io.Serializable;
@Getter@ToString@AllArgsConstructor@NoArgsConstructor@Setter

public class LiftDTO implements Serializable {
    private int currentFloor;
    private String direction;
    private double maxWeightCapacity;
    private boolean Operational;
}

