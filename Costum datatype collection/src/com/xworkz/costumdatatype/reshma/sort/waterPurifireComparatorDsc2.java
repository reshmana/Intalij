package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.WaterPurifireDTO;

import java.util.Comparator;

public class waterPurifireComparatorDsc2 implements Comparator<WaterPurifireDTO> {
    @Override
    public int compare(WaterPurifireDTO o1, WaterPurifireDTO o2) {
        String str= o1.getPurificationTechnology();
        String str1= o2.getModel();
        return str1.compareTo(str);
    }
}
