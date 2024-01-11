package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.BeltDTO;

import java.util.Comparator;

public class BeltComparatorDsc1 implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        int l= o1.getLength();
        int l1= o2.getLength();
        return Integer.compare(l1,l);
    }
}
