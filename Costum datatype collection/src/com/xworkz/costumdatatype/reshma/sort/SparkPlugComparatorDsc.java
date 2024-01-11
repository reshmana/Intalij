package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.SparkPlugDTO;

import java.util.Comparator;

public class SparkPlugComparatorDsc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        String type=o1.getType();
        String type1= o2.getType();
        return type1.compareTo(type);
    }
}
