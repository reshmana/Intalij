package com.xworkz.comparable.dto;

import lombok.*;

import java.io.Serializable;
@ToString@NoArgsConstructor@AllArgsConstructor@Setter@Getter
public class WatchDTO implements Serializable,Comparable<WatchDTO> {

    private String Brand;
    private double cost;
    private String type;
    private boolean waterRegistance;

    @Override
    public int compareTo(WatchDTO o) {
        return this.getBrand().compareTo(o.getBrand());
    }
}
