package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.SpeakerDTO;

import java.util.Comparator;

public class SpeakerComparatorDsc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        String brand= o1.getBrand();
        String brand1= o2.getBrand();
        return brand1.compareTo(brand);
    }
}
