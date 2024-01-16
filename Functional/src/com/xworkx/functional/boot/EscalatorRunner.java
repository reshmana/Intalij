package com.xworkx.functional.boot;

import com.xworkx.functional.DTO.EscalatorDTO;
import com.xworkx.functional.DTO.SkyWalkDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EscalatorRunner {
    public static void main(String[] args) {

        EscalatorDTO escalatorDTO=new EscalatorDTO("up",100,200,1000);
        EscalatorDTO escalatorDTO1=new EscalatorDTO("down",200,10,250);
        EscalatorDTO escalatorDTO2=new EscalatorDTO("up",10,50,500);
        EscalatorDTO escalatorDTO3=new EscalatorDTO("down",30,800,650);
        EscalatorDTO escalatorDTO4=new EscalatorDTO("up",70,10,850);

        List<EscalatorDTO>  list=new ArrayList<>();
        list.add(escalatorDTO);
        list.add(escalatorDTO1);
        list.add(escalatorDTO2);
        list.add(escalatorDTO3);
        list.add(escalatorDTO4);
        System.out.println("Ascending by Direction");
        Comparator<EscalatorDTO> escalatorDTOComparatordirectionAsc = (name1, name2) -> {
            return name1.getDirection().compareTo(name2.getDirection());
        };
        Collections.sort(list, escalatorDTOComparatordirectionAsc);
        for (EscalatorDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("Descending by Direction");
        Comparator<EscalatorDTO> escalatorDTOComparatordirectionDsc = (name1, name2) -> {
            return name2.getDirection().compareTo(name1.getDirection());
        };
        Collections.sort(list, escalatorDTOComparatordirectionDsc);
        for (EscalatorDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("===================");
        System.out.println("ascending by Speed");
        Comparator<EscalatorDTO> escalatorDTOComparatorSpeedAsc = (o1, o2) -> {
            return Double.compare(o1.getSpeed(), o2.getSpeed());
        };
        Collections.sort(list, escalatorDTOComparatorSpeedAsc);
        for (EscalatorDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("Descending by Speed");
        Comparator<EscalatorDTO> escalatorDTOComparatorSpeedDsc = (o1, o2) -> {
            return Double.compare(o2.getSpeed(), o1.getSpeed());
        };
        Collections.sort(list, escalatorDTOComparatorSpeedDsc);
        for (EscalatorDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("===============================");

        System.out.println("ascending by capacity");
        Comparator<EscalatorDTO> escalatorDTOComparatorcapacityAsc = (o1, o2) -> {
            return Double.compare(o1.getCapacity(), o2.getCapacity());
        };
        Collections.sort(list, escalatorDTOComparatorcapacityAsc);
        for (EscalatorDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("Descending by capacity");
        Comparator<EscalatorDTO> escalatorDTOComparatorcapacityDsc = (o1, o2) -> {
            return Double.compare(o2.getCapacity(), o1.getCapacity());
        };
        Collections.sort(list, escalatorDTOComparatorcapacityDsc);
        for (EscalatorDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("===============================");

        System.out.println("ascending by occupancy");
        Comparator<EscalatorDTO> escalatorDTOComparatorOccupancyAsc = (o1, o2) -> {
            return Integer.compare(o1.getOccupancy(), o2.getOccupancy());
        };
        Collections.sort(list, escalatorDTOComparatorOccupancyAsc);
        for (EscalatorDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("Descending by occupancy");
        Comparator<EscalatorDTO> escalatorDTOComparatorOccupancyDsc = (o1, o2) -> {
            return Integer.compare(o2.getOccupancy(), o1.getOccupancy());
        };
        Collections.sort(list, escalatorDTOComparatorOccupancyDsc);
        for (EscalatorDTO dto : list) {
            System.out.println(dto);
        }


    }
}
