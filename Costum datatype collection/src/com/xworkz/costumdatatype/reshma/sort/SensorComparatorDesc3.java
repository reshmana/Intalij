package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.SensorDTO;

import java.util.Comparator;

public class SensorComparatorDesc3 implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        String str= o1.getName();
        String str1=o2.getName();

        return o2.getName().compareTo(o1.getName());
    }
}
