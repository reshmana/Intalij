package com.xworkx.functional.DTO;

import lombok.*;

import java.io.Serializable;
@Getter@ToString@AllArgsConstructor@NoArgsConstructor@Setter

public class RadioDTO implements Serializable {
    private double frequency;
    private int volume;
    private String name;
    private boolean isOn;

}
