package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.CharcoalDTO;

import java.util.Comparator;

public class CharcoalComparatorDsc2 implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        int ash= o1.getAshContent();
        int ash1=o2.getAshContent();

        return Integer.compare(o2.getAshContent(),o1.getAshContent());

    }
}
