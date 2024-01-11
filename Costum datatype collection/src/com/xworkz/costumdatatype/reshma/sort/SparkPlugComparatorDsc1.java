package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.SparkPlugDTO;

import java.util.Comparator;

public class SparkPlugComparatorDsc1 implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        String m= o1.getMaterial();
        String m1= o2.getMaterial();
        return m1.compareTo(m);
    }
}
