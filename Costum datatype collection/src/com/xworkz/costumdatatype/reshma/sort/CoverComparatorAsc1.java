package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.CoverDTO;

import java.util.Comparator;

public class CoverComparatorAsc1 implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        double cost=o1.getCost();
        double cost1=o2.getCost();
        return Double.compare(cost,cost1);
    }
}
