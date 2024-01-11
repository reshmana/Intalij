package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.CoverDTO;

import java.util.Comparator;

public class CoverComparatorDsc2 implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        boolean or= o1.isOriginal();
        boolean or1= o2.isOriginal();
        return Boolean.compare(or1,or);
    }
}
