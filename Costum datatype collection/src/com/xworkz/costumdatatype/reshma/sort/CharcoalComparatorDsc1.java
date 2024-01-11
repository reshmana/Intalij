package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.CharcoalDTO;

import java.util.Comparator;

public class CharcoalComparatorDsc1 implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {

        boolean cr= o1.isCarbonContent();
        boolean cr1= o2.isCarbonContent();
        return Boolean.compare(cr1,cr);
    }
}
