package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.WaterPurifireDTO;

import java.util.Comparator;

public class waterPurifireComparatorAsc3 implements Comparator<WaterPurifireDTO> {
    @Override
    public int compare(WaterPurifireDTO o1, WaterPurifireDTO o2) {
        boolean s=o1.isSmartFeatures();
        boolean s1= o2.isSmartFeatures();
        return Boolean.compare(s,s1);
    }
}
