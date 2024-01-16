package com.xworkx.functional.boot;

import com.xworkx.functional.DTO.SkyWalkDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SkyWalkRunner {
    public static void main(String[] args) {

        SkyWalkDTO skyWalkDTO = new SkyWalkDTO("Celestial", 50, 80, 250);
        SkyWalkDTO skyWalkDTO1 = new SkyWalkDTO("GangaVista Skywalk", 49, 250, 450);
        SkyWalkDTO skyWalkDTO2 = new SkyWalkDTO("Taj Terrace Walk", 60, 100, 560);
        SkyWalkDTO skyWalkDTO3 = new SkyWalkDTO("Lotus Linkway", 80, 150, 900);
        SkyWalkDTO skyWalkDTO4 = new SkyWalkDTO("SpiceRoute Skywalk", 100, 50, 300);

        List<SkyWalkDTO> list = new ArrayList<>();
        list.add(skyWalkDTO);
        list.add(skyWalkDTO1);
        list.add(skyWalkDTO2);
        list.add(skyWalkDTO3);
        list.add(skyWalkDTO4);
        System.out.println("Ascending by name");
        Comparator<SkyWalkDTO> skyWalkDTOComparatorAsc = (name1, name2) -> {
            return name1.getName().compareTo(name2.getName());
        };
        Collections.sort(list, skyWalkDTOComparatorAsc);
        for (SkyWalkDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("Descending by name");
        Comparator<SkyWalkDTO> skyWalkDTOComparatorDsc = (name1, name2) -> {
            return name2.getName().compareTo(name1.getName());
        };
        Collections.sort(list, skyWalkDTOComparatorDsc);
        for (SkyWalkDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("===================");
        System.out.println("ascending by length");
        Comparator<SkyWalkDTO> skyWalkDTOComparatorLengthAsc = (o1, o2) -> {
            return Double.compare(o1.getLength(), o2.getLength());
        };
        Collections.sort(list, skyWalkDTOComparatorLengthAsc);
        for (SkyWalkDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("Descending by length");
        Comparator<SkyWalkDTO> skyWalkDTOComparatorLengthDsc = (o1, o2) -> {
            return Double.compare(o2.getLength(), o1.getLength());
        };
        Collections.sort(list, skyWalkDTOComparatorLengthDsc);
        for (SkyWalkDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("===============================");

        System.out.println("ascending by height");
        Comparator<SkyWalkDTO> skyWalkDTOComparatorHeightAsc = (o1, o2) -> {
            return Double.compare(o1.getHeight(), o2.getHeight());
        };
        Collections.sort(list, skyWalkDTOComparatorHeightAsc);
        for (SkyWalkDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("Descending by height");
        Comparator<SkyWalkDTO> skyWalkDTOComparatorHeightDsc = (o1, o2) -> {
            return Double.compare(o2.getHeight(), o1.getHeight());
        };
        Collections.sort(list, skyWalkDTOComparatorHeightDsc);
        for (SkyWalkDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("===============================");

        System.out.println("ascending by capacity");
        Comparator<SkyWalkDTO> skyWalkDTOComparatorCapacitytAsc = (o1, o2) -> {
            return Integer.compare(o1.getCapacity(), o2.getCapacity());
        };
        Collections.sort(list, skyWalkDTOComparatorCapacitytAsc);
        for (SkyWalkDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("Descending by capacity");
        Comparator<SkyWalkDTO> skyWalkDTOComparatorCapacityDsc = (o1, o2) -> {
            return Integer.compare(o2.getCapacity(), o1.getCapacity());
        };
        Collections.sort(list, skyWalkDTOComparatorCapacityDsc);
        for (SkyWalkDTO dto : list) {
            System.out.println(dto);
        }
    }
}