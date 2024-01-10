package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.PaperDTO;

import java.util.Comparator;

public class PaperCOmparatorAsc3 implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        String str=o1.getType();
        String str1= o2.getType();

        return str.compareTo(str1);
    }
}
