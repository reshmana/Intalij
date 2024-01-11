package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.CharcoalDTO;

import java.util.Comparator;

public class CharcoarComparatorAsc implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        double p=o1.getPorosity();
        double p1=o2.getPorosity();
        return Double.compare(p,p1);
    }
}
