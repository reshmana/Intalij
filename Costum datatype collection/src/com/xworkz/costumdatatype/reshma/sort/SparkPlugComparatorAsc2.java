package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.SparkPlugDTO;

import java.util.Comparator;

public class SparkPlugComparatorAsc2 implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        int no= o1.getVoltage();
        int no1= o2.getVoltage();
        return Integer.compare(no,no1);
    }
}
