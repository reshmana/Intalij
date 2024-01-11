package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.SparkPlugDTO;

import java.util.Comparator;

public class SparkPlugComparatorAsc3 implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        boolean t= o1.isReliable();
        boolean t1= o2.isReliable();
        return Boolean.compare(o1.isReliable(),o2.isReliable());
    }
}
