package com.xworkz.costumdatatype.reshma.boot;

import com.xworkz.costumdatatype.reshma.dto.PaperDTO;
import com.xworkz.costumdatatype.reshma.dto.ParkingDTO;
import com.xworkz.costumdatatype.reshma.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class parkingRunner {
    public static void main(String[] args) {
        ParkingDTO parkingDTO=new ParkingDTO(8,"governament",10000,"4 willer");
        ParkingDTO parkingDTO1=new ParkingDTO(10,"private",100,"2 willer");
        ParkingDTO parkingDTO2=new ParkingDTO(01,"company",1500,"4 willer");
        ParkingDTO parkingDTO3=new ParkingDTO(05,"governament",1200,"2willer");
        ParkingDTO parkingDTO4=new ParkingDTO(20,"private",10," bysicle");

        List<ParkingDTO> list=new ArrayList<>();
        list.add(parkingDTO);
        list.add(parkingDTO1);
        list.add(parkingDTO2);
        list.add(parkingDTO3);
        list.add(parkingDTO4);
        for(ParkingDTO dto:list){
            System.out.println(dto);
        }
        Comparator<ParkingDTO> comparator=new ParkingComparatorAsc();
        Collections.sort(list,comparator);
        System.out.println("Ascending order by using spotNumber");
        for (ParkingDTO ref:list){
            System.out.println(ref);
        }

        Comparator<ParkingDTO> comparator1 = new ParkingComparatorDsc();
        Collections.sort(list,comparator1);
        System.out.println("Descending order by comparing spotNumber");
        for (ParkingDTO ref:list){
            System.out.println(ref);
        }

        System.out.println("===================================");

        Comparator<ParkingDTO> comparator2=new ParkingComparatorAsc1();
        Collections.sort(list,comparator2);
        System.out.println("Ascending order by using occupied");
        for (ParkingDTO ref:list){
            System.out.println(ref);
        }

        Comparator<ParkingDTO> comparator3 = new ParkingComparatorDsc1();
        Collections.sort(list,comparator3);
        System.out.println("Descending order by comparing occupied");
        for (ParkingDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("===============================");

        Comparator<ParkingDTO> comparator4=new ParkingComparatorAsc2();
        Collections.sort(list,comparator4);
        System.out.println("Ascending order by using NOOfoVehicle");
        for (ParkingDTO ref:list){
            System.out.println(ref);
        }

        Comparator<ParkingDTO> comparator5 = new ParkingComparatorDsc2();
        Collections.sort(list,comparator5);
        System.out.println("Descending order by comparing NOOfoVehicle");
        for (ParkingDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("========================");

        Comparator<ParkingDTO> comparator6=new ParkingComparatorAsc3();
        Collections.sort(list,comparator6);
        System.out.println("Ascending order by using Vehicletype");
        for (ParkingDTO ref:list){
            System.out.println(ref);
        }

        Comparator<ParkingDTO> comparator7 = new ParkingComparatorDsc3();
        Collections.sort(list,comparator7);
        System.out.println("Descending order by comparing Vehicletype");
        for (ParkingDTO ref:list){
            System.out.println(ref);
        }



    }
}
