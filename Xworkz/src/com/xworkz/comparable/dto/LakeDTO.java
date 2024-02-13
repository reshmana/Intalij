package com.xworkz.comparable.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString

public class LakeDTO implements Serializable,Comparable<LakeDTO> {

       private String name;
       private  String location;
       private double areaInKms;
       private double DepthInMtrs;

    @Override
    public int compareTo(LakeDTO o) {
        return this.getName().compareTo(o.getName());
    }
}
