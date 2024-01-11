package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.BeltDTO;

import java.util.Comparator;

public class BeltComparatorAsc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        String str=o1.getMaterial();
        String str1= o2.getMaterial();
        return str.compareTo(str1);
    }
}
