package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.ParkingDTO;

import java.util.Comparator;

public class ParkingComparatorDsc3 implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        String ty= o1.getVehicletype();
        String ty1= o2.getVehicletype();
        return ty1.compareTo(ty);
    }
}
