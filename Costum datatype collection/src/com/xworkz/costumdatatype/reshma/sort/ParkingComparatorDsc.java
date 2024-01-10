package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.ParkingDTO;

import java.util.Comparator;

public class ParkingComparatorDsc implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        int no= o1.getSpotNumber();
        int no1= o2.getSpotNumber();
        return Integer.compare(o2.getSpotNumber(),o1.getSpotNumber());
    }
}
