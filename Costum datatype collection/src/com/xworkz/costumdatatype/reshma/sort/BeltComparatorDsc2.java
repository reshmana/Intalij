package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.BeltDTO;

import java.util.Comparator;

public class BeltComparatorDsc2 implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        String str= o1.getBuckleType();
        String str1= o2.getBuckleType();
        return str1.compareTo(str);
    }
}
