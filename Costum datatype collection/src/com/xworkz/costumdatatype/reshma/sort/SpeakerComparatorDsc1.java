package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.SpeakerDTO;

import java.util.Comparator;

public class SpeakerComparatorDsc1 implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        String model=o1.getModel();
        String model1=o2.getModel();
        return model1.compareTo(model);
    }
}
