package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString

public class AirLineDTO implements Serializable {
    private String planeName;
    private String source;
    private String destination;
}
