package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.SensorDTO;

import java.util.Comparator;

public class SensorComparatorDesc implements Comparator<SensorDTO> {

    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        double cost = o1.getCost();
        double cost2 = o2.getCost();
        return Double.compare(cost2, cost);
    }
}
