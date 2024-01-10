package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.PaperDTO;

import java.util.Comparator;

public class PapreComparatorDesc1 implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        double w= o1.getWidth();
        double w1=o2.getWidth();
        return Double.compare(o2.getWidth(),o1.getWidth());
    }
}
