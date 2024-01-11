package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.RifillDTO;

import java.util.Comparator;

public class RifillComparatorAsc1 implements Comparator<RifillDTO> {
    @Override
    public int compare(RifillDTO o1, RifillDTO o2) {
        int no = o1.getInkVolume();
        int no1=o2.getInkVolume();
        return Integer.compare(o1.getInkVolume(),o2.getInkVolume());
    }
}
