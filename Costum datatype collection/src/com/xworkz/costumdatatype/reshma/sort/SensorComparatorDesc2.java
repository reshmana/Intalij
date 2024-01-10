package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.SensorDTO;

import java.util.Comparator;

public class SensorComparatorDesc2 implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        String str= o1.getType();
        String str1=o2.getType();

        return o2.getType().compareTo(o1.getType());

    }
}
