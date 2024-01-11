package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.SpeakerDTO;

import java.util.Comparator;

public class SpeakerComparatorDsc3 implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        boolean w= o1.isWireless();
        boolean w1= o2.isWireless();
        return Boolean.compare(o2.isWireless(),o1.isWireless());
    }
}
