package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.PaperDTO;

import java.util.Comparator;

public class PapreComparatorDesc2 implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        boolean l1 = o1.isLandscape();
        boolean l2 = o2.isLandscape();

        // Compare the boolean values directly
        return Boolean.compare(l2, l1);
    }
}
