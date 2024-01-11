package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.RifillDTO;

import java.util.Comparator;

public class RifillComparatorAsc implements Comparator<RifillDTO> {
    @Override
    public int compare(RifillDTO o1, RifillDTO o2) {
        String str= o1.getInkColor();
        String str1= o2.getInkColor();

        return str.compareTo(str1);
    }
}
