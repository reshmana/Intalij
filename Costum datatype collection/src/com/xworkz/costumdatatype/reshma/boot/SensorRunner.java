package com.xworkz.costumdatatype.reshma.boot;

import com.xworkz.costumdatatype.reshma.dto.SensorDTO;
import com.xworkz.costumdatatype.reshma.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SensorRunner {
    public static void main(String[] args) {


        SensorDTO sensorDTO = new SensorDTO("hella ", "touch", 250, 1);
        SensorDTO sensorDTO1 = new SensorDTO("Accelerometer", "presur", 500, 2);
        SensorDTO sensorDTO2 = new SensorDTO("Gyroscope", "motion", 600, 5);
        SensorDTO sensorDTO3 = new SensorDTO("Magnetometer ", "temperatue", 1000, 4);
        SensorDTO sensorDTO4 = new SensorDTO("light sensor", "proximity", 1500, 3);

        List<SensorDTO> list = new ArrayList<>();
        list.add(sensorDTO);
        list.add(sensorDTO1);
        list.add(sensorDTO2);
        list.add(sensorDTO3);
        list.add(sensorDTO4);
        for (SensorDTO dto : list) {
            System.out.println(dto);
        }

        Comparator<SensorDTO> comparator=new SensorComparatorASC();
        Collections.sort(list,comparator);
        System.out.println("Ascending order by using cost");
        for (SensorDTO ref:list){
            System.out.println(ref);
        }

        Comparator<SensorDTO> comparator1 = new SensorComparatorDesc();
        Collections.sort(list,comparator1);
        System.out.println("Descending order by comparing cost");
        for (SensorDTO ref:list){
            System.out.println(ref);
        }

        System.out.println("===================================");

        Comparator<SensorDTO> comparator2=new SensorComparatorAsc1();
        Collections.sort(list,comparator2);
        System.out.println("Ascending order by using distance");
        for (SensorDTO ref:list){
            System.out.println(ref);
        }

        Comparator<SensorDTO> comparator3 = new SensorCompatatorDesc1();
        Collections.sort(list,comparator3);
        System.out.println("Descending order by comparing distance");
        for (SensorDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("===============================");

        Comparator<SensorDTO> comparator4=new SensorComparatorAsc2();
        Collections.sort(list,comparator4);
        System.out.println("Ascending order by using name");
        for (SensorDTO ref:list){
            System.out.println(ref);
        }

        Comparator<SensorDTO> comparator5 = new SensorComparatorDesc2();
        Collections.sort(list,comparator5);
        System.out.println("Descending order by comparing name");
        for (SensorDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("========================");

        Comparator<SensorDTO> comparator6=new SensorComparatorAsc3();
        Collections.sort(list,comparator6);
        System.out.println("Ascending order by using type");
        for (SensorDTO ref:list){
            System.out.println(ref);
        }

        Comparator<SensorDTO> comparator7 = new SensorComparatorDesc3();
        Collections.sort(list,comparator7);
        System.out.println("Descending order by comparing type");
        for (SensorDTO ref:list){
            System.out.println(ref);
        }

    }
}
