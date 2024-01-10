package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.ParkingDTO;

import java.util.Comparator;

public class ParkingComparatorAsc2 implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {

        double first= o1.getNOOfoVehicle();
        double first1= o2.getNOOfoVehicle();
        return Double.compare(o1.getNOOfoVehicle(),o2.getNOOfoVehicle());
    }
}
