package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.WaterPurifireDTO;

import java.util.Comparator;

public class waterPurifireComparatorAsc1 implements Comparator<WaterPurifireDTO> {
    @Override
    public int compare(WaterPurifireDTO o1, WaterPurifireDTO o2) {
        int no=o1.getFiltrationCapacity();
        int no1=o2.getFiltrationCapacity();
        return Integer.compare(no,no1);
    }
}
