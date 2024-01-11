package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.CoverDTO;

import java.util.Comparator;

public class CoverComparatorAsc implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        String str= o1.getName();
        String str1= o2.getName();
        return str.compareTo(str1);
    }
}
