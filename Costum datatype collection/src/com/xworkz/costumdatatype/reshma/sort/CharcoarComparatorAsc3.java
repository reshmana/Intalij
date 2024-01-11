package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.CharcoalDTO;

import java.util.Comparator;

public class CharcoarComparatorAsc3 implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        double no= o1.getHeatOutput();
        double no1=o2.getHeatOutput();
        return Double.compare(no,no1);
    }
}
