package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.RifillDTO;

import java.util.Comparator;

public class RifillComparatorDsc1 implements Comparator<RifillDTO> {
    @Override
    public int compare(RifillDTO o1, RifillDTO o2) {
            int no = o1.getInkVolume();
            int no1=o2.getInkVolume();
            return Integer.compare(o2.getInkVolume(),o1.getInkVolume());
    }
}
