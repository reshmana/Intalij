package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.RifillDTO;

import java.util.Comparator;

public class RifillComparatorDsc3 implements Comparator<RifillDTO> {
    @Override
    public int compare(RifillDTO o1, RifillDTO o2) {
        boolean first= o1.isCompatible();
        boolean first1= o2.isCompatible();
        return Boolean.compare(first1,first);
    }
}
