package com.xworkx.functional.boot;

import com.xworkx.functional.DTO.GeyserDTO;
import com.xworkx.functional.DTO.SkyWalkDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GeyserRunner {
    public static void main(String[] args) {

        GeyserDTO geyserDTO=new GeyserDTO("V-guard","black",100,8);
        GeyserDTO geyserDTO1=new GeyserDTO("orient-aquator","white",50,5);
        GeyserDTO geyserDTO2=new GeyserDTO("Venus-megaplus","gray",80,3);
        GeyserDTO geyserDTO3=new GeyserDTO("Crompton","brown",40,6);
        GeyserDTO geyserDTO4=new GeyserDTO("bajaj","blue",10,2);

        List<GeyserDTO> list=new ArrayList<>();
        list.add(geyserDTO);
        list.add(geyserDTO1);
        list.add(geyserDTO2);
        list.add(geyserDTO3);
        list.add(geyserDTO4);
        System.out.println("Ascending by brand");
        Comparator<GeyserDTO> geyserDTOComparatorbrandASc = (o1, o2) -> {
            return o1.getBrand().compareTo(o2.getBrand());
        };
        Collections.sort(list, geyserDTOComparatorbrandASc);
        for (GeyserDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("Descending by brand");
        Comparator<GeyserDTO> geyserDTOComparatorbrandDsc = (o1, o2) -> {
            return o2.getBrand().compareTo(o1.getBrand());
        };
        Collections.sort(list, geyserDTOComparatorbrandDsc);
        for (GeyserDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("===================");
        System.out.println("ascending by color");
        Comparator<GeyserDTO> geyserDTOComparatorColorAsc = (o1, o2) -> {
            return o1.getColor().compareTo(o2.getColor());
        };
        Collections.sort(list, geyserDTOComparatorColorAsc);
        for (GeyserDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("Descending by color");
        Comparator<GeyserDTO> geyserDTOComparatorColorDsc = (o1, o2) -> {
            return o2.getColor().compareTo(o1.getColor());
        };
        Collections.sort(list, geyserDTOComparatorColorDsc);
        for (GeyserDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("===============================");

        System.out.println("ascending by temperature");
        Comparator<GeyserDTO> geyserDTOComparatorTemperatureAsc = (o1, o2) -> {
            return Double.compare(o1.getTemperature(), o2.getTemperature());
        };
        Collections.sort(list, geyserDTOComparatorTemperatureAsc);
        for (GeyserDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("Descending by temperature");
        Comparator<GeyserDTO> geyserDTOComparatorTemperatureDsc = (o1, o2) -> {
            return Double.compare(o2.getTemperature(), o1.getTemperature());
        };
        Collections.sort(list, geyserDTOComparatorTemperatureDsc);
        for (GeyserDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("===============================");

        System.out.println("ascending by pressure");
        Comparator<GeyserDTO> geyserDTOComparatorPressureAsc= (o1, o2) -> {
            return Double.compare(o1.getPressure(), o2.getPressure());
        };
        Collections.sort(list, geyserDTOComparatorPressureAsc);
        for (GeyserDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("Descending by pressure");
        Comparator<GeyserDTO> geyserDTOComparatorPressureDsc = (o1, o2) -> {
            return Double.compare(o2.getPressure(), o1.getPressure());
        };
        Collections.sort(list, geyserDTOComparatorPressureDsc);
        for (GeyserDTO dto : list) {
            System.out.println(dto);
        }


    }
}
