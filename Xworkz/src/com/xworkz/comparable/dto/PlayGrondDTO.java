package com.xworkz.comparable.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class PlayGrondDTO implements Serializable,Comparable<PlayGrondDTO> {
    private String name;
    private String location;
    private double NoOfVisitors;
    private double area;
    @Override
    public int compareTo(PlayGrondDTO o) {
        return Double.compare(this.getNoOfVisitors(),o.getNoOfVisitors());
    }
}
