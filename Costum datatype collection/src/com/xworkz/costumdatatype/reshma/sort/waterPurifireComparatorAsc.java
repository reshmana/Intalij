package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.WaterPurifireDTO;

import java.util.Comparator;

public class waterPurifireComparatorAsc implements Comparator<WaterPurifireDTO> {
    @Override
    public int compare(WaterPurifireDTO o1, WaterPurifireDTO o2) {
        String str= o1.getModel();
        String str1=o2.getModel();
        return str.compareTo(str1);
    }
}
