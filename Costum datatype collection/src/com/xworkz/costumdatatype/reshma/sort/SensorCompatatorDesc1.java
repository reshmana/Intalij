package com.xworkz.costumdatatype.reshma.sort;

import com.xworkz.costumdatatype.reshma.dto.SensorDTO;

import java.util.Comparator;

public class SensorCompatatorDesc1 implements Comparator<SensorDTO>{
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        int dist= o1.getDistance();
        int dist1= o2.getDistance();

        return Integer.compare(dist1,dist);
    }
}
