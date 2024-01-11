package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.BeltDTO;

import java.util.Comparator;

public class BeltComparatorDsc3 implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        String col= o1.getColor();
        String col1= o2.getMaterial();
        return col1.compareTo(col);    }
}
