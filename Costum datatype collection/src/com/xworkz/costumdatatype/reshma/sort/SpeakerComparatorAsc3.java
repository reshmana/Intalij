package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.SpeakerDTO;

import java.util.Comparator;

public class SpeakerComparatorAsc3 implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        boolean w= o1.isWireless();
        boolean w1= o2.isWireless();
        return Boolean.compare(o1.isWireless(),o2.isWireless());
    }
}
