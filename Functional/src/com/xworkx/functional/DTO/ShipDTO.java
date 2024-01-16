package com.xworkx.functional.DTO;

import lombok.*;

import java.io.Serializable;
@NoArgsConstructor@Getter@ToString@AllArgsConstructor@Setter

public class ShipDTO implements Serializable {
    private String name;
    private double length;
    private double maxSpeed;
    private boolean Sailing;
}
