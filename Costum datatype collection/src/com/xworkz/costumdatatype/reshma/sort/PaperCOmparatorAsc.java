package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.PaperDTO;

import java.util.Comparator;

public class PaperCOmparatorAsc implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        double h=o1.getWeight();
        double h1= o2.getWeight();
        return Double.compare(o1.getWeight(), o2.getWeight());
    }
}
