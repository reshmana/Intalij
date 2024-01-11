package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.SpeakerDTO;

import java.util.Comparator;

public class SpeakerComparatorAsc2 implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        int no=o1.getPowerRating();
        int no1= o2.getPowerRating();
        return Integer.compare(no,no1);
    }
}
