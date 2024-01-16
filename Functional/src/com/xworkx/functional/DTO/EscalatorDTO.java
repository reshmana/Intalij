package com.xworkx.functional.DTO;

import lombok.*;

import java.io.Serializable;
@Getter@ToString@AllArgsConstructor@NoArgsConstructor@Setter

public class EscalatorDTO implements Serializable {
    private String Direction;
    private double speed;
    private int capacity;
    private int occupancy;

}
