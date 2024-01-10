package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.SensorDTO;

import java.util.Comparator;

public class SensorComparatorAsc3 implements Comparator<SensorDTO> {

    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        String str= o1.getName();
        String str1=o2.getName();

        return o1.getName().compareTo(o2.getName());
    }
}
