package com.xworkx.functional.DTO;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString

public class VentilatorDTO implements Serializable {
    private String brand;
    private String mode;
    private int pressureLevel;
    private boolean isPortable;

}
