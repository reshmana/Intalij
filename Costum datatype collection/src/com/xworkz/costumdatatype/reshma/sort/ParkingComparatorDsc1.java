package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.PaperDTO;
import com.xworkz.costumdatatype.reshma.dto.ParkingDTO;

import java.util.Comparator;

public class ParkingComparatorDsc1 implements Comparator<ParkingDTO> {

    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        String str=o1.getOccupied();
        String str1= o2.getOccupied();
        return str1.compareTo(str);

    }
}

