package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.RifillDTO;

import java.util.Comparator;

public class RifillComparatorAsc2 implements Comparator<RifillDTO> {
    @Override
    public int compare(RifillDTO o1, RifillDTO o2) {
        String b= o1.getBrand();
        String b1= o2.getBrand();
        return b.compareTo(b1);
    }
}
