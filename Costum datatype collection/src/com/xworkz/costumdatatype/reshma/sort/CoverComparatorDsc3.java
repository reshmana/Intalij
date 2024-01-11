package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.CoverDTO;

import java.util.Comparator;

public class CoverComparatorDsc3 implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        int no= o1.getThickness();
        int no1= o2.getThickness();
        return Integer.compare(no1,no);
    }
}
