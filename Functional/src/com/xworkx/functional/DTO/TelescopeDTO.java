package com.xworkx.functional.DTO;

import lombok.*;

import java.io.Serializable;
@Getter@ToString@AllArgsConstructor@NoArgsConstructor@Setter
public class TelescopeDTO implements Serializable {
    private String Name;
    private double apertureSize;
    private double focalLength;
    private boolean Motorized;


}
