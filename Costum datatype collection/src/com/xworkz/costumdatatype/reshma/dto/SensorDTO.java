package com.xworkz.costumdatatype.reshma.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SensorDTO implements Serializable {
        private String name;
        private String type;
        private double cost;
        private int distance;

}
