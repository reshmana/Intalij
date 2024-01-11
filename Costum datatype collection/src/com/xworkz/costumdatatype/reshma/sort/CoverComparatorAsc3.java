package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.CoverDTO;
import com.xworkz.costumdatatype.reshma.dto.RifillDTO;

import java.util.Comparator;

public class CoverComparatorAsc3 implements Comparator<CoverDTO> {


    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        int no= o1.getThickness();
        int no1= o2.getThickness();
        return Integer.compare(no,no1);
    }
}


