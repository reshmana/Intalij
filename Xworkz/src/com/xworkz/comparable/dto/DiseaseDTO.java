package com.xworkz.comparable.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@ToString@NoArgsConstructor@AllArgsConstructor
public class DiseaseDTO implements Serializable,Comparable<DiseaseDTO> {

    private String DiseaseName;
    private String type;
    private String hospital;
    private double NoOfPatient;

    @Override
    public int compareTo(DiseaseDTO o) {
        return this.getDiseaseName().compareTo(o.getDiseaseName());
    }
}
