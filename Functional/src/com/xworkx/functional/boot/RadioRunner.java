package com.xworkx.functional.boot;

import com.xworkx.functional.DTO.RadioDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RadioRunner {
    public static void main(String[] args) {
        RadioDTO radioDTO=new RadioDTO(693,1,"big Fm",true);
        RadioDTO radioDTO1=new RadioDTO(990,2,"fiver 104 FM",false);
        RadioDTO radioDTO2=new RadioDTO(10803,3,"radio mirchi",true);
        RadioDTO radioDTO3=new RadioDTO(11023,5,"radio one" ,false);
        RadioDTO radioDTO4=new RadioDTO(11495,6,"friends FM",true);

        List<RadioDTO> list=new ArrayList<>();
        list.add(radioDTO);
        list.add(radioDTO1);
        list.add(radioDTO2);
        list.add(radioDTO3);
        list.add(radioDTO4);
        System.out.println("Ascending by frequancy");
        Comparator<RadioDTO> radioDTOComparatorfrequancyAsc=(o1 ,o2)->{
            return Double.compare(o1.getFrequency(),o2.getFrequency());
        };
        Collections.sort(list,radioDTOComparatorfrequancyAsc);
        for (RadioDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by frequancy");
        Comparator<RadioDTO> radioDTOComparatorfrequancyDsc=(o1 ,o2)->{
            return Double.compare(o2.getFrequency(),o1.getFrequency());
        };
        Collections.sort(list,radioDTOComparatorfrequancyDsc);
        for (RadioDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("==================================");

        System.out.println("Ascending by volume");
        Comparator<RadioDTO> radioDTOComparatorvolumeAsc=(o1 ,o2)->{
            return Integer.compare(o1.getVolume(),o2.getVolume());
        };
        Collections.sort(list,radioDTOComparatorvolumeAsc);
        for (RadioDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by volume");
        Comparator<RadioDTO> radioDTOComparatorvolumeDsc=(o1 ,o2)->{
            return Integer.compare(o2.getVolume(),o1.getVolume());
        };
        Collections.sort(list,radioDTOComparatorvolumeDsc);
        for (RadioDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("==================================");

        System.out.println("Ascending by name");
        Comparator<RadioDTO> radioDTOComparatornameAsc=(o1 ,o2)->{
            return o1.getName().compareTo(o2.getName());
        };
        Collections.sort(list,radioDTOComparatornameAsc);
        for (RadioDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by name");
        Comparator<RadioDTO> radioDTOComparatornameDsc=(o1 ,o2)->{
            return o2.getName().compareTo(o1.getName());
        };
        Collections.sort(list,radioDTOComparatornameDsc);
        for (RadioDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("==================================");

        System.out.println("Ascending by isOn");
        Comparator<RadioDTO> radioDTOComparatorisOnAsc=(o1 ,o2)->{
            return Boolean.compare(o1.isOn(),o2.isOn());
        };
        Collections.sort(list,radioDTOComparatorisOnAsc);
        for (RadioDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by isOn");
        Comparator<RadioDTO> radioDTOComparatorisOnDsc=(o1 ,o2)->{
            return Boolean.compare(o2.isOn(),o1.isOn());
        };
        Collections.sort(list,radioDTOComparatorisOnDsc);
        for (RadioDTO dto:list){
            System.out.println(dto);
        }
    }
}
