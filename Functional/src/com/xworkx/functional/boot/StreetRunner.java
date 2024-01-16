package com.xworkx.functional.boot;

import com.xworkx.functional.DTO.StreetDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreetRunner {
    public static void main(String[] args) {

        StreetDTO streetDTO=new StreetDTO("1st main",200,2,true);
        StreetDTO streetDTO1=new StreetDTO("3st main",150,1,true);
        StreetDTO streetDTO2=new StreetDTO("8st main",100,4,false);
        StreetDTO streetDTO3=new StreetDTO("9st main",450,3,true);
        StreetDTO streetDTO4=new StreetDTO("5st main",500,1,false);

        List<StreetDTO> list=new ArrayList<>();
        list.add(streetDTO);
        list.add(streetDTO1);
        list.add(streetDTO2);
        list.add(streetDTO3);
        list.add(streetDTO4);

        System.out.println("Ascending by streetname");
        Comparator<StreetDTO> streetDTOComparatorStreetnameAsc=(o1,o2)->{
            return o1.getStreetName().compareTo(o2.getStreetName());
        };
        Collections.sort(list,streetDTOComparatorStreetnameAsc);
        for (StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by streetname");
        Comparator<StreetDTO> streetDTOComparatorStreetnameDsc=(o1,o2)->{
            return o2.getStreetName().compareTo(o1.getStreetName());
        };
        Collections.sort(list,streetDTOComparatorStreetnameDsc);
        for (StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("=============================");

        System.out.println("Ascending by length");
        Comparator<StreetDTO> streetDTOComparatorlengthAsc=(o1,o2)->{
               return  Double.compare(o1.getLength(),o2.getLength());
        };
        Collections.sort(list,streetDTOComparatorlengthAsc);
        for (StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by length");
        Comparator<StreetDTO> streetDTOComparatorlengthDsc=(o1,o2)->{
            return  Double.compare(o1.getLength(),o2.getLength());
        };
        Collections.sort(list,streetDTOComparatorlengthDsc);
        for (StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("=============================");

        System.out.println("Ascending by numberOfLanes");
        Comparator<StreetDTO> streetDTOComparatornumberOfLanesAsc=(o1,o2)->{
            return Integer.compare(o1.getNumberOfLanes(), o2.getNumberOfLanes());
        };
        Collections.sort(list,streetDTOComparatornumberOfLanesAsc);
        for (StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by numberOfLanes");
        Comparator<StreetDTO> streetDTOComparatornumberOfLanesDsc=(o1,o2)->{
            return Integer.compare(o1.getNumberOfLanes(), o2.getNumberOfLanes());
        };
        Collections.sort(list,streetDTOComparatornumberOfLanesDsc);
        for (StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("=============================");

        System.out.println("Ascending by Residential");
        Comparator<StreetDTO> streetDTOComparatorStreetResidentialAsc=(o1,o2)->{
         return Boolean.compare(o1.isResidential(),o2.isResidential());
        };
        Collections.sort(list,streetDTOComparatorStreetResidentialAsc);
        for (StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by Residential");
        Comparator<StreetDTO> streetDTOComparatorStreetResidentialDsc=(o1,o2)->{
            return Boolean.compare(o2.isResidential(),o1.isResidential());
        };
        Collections.sort(list,streetDTOComparatorStreetResidentialDsc);
        for (StreetDTO dto:list){
            System.out.println(dto);
        }
    }
}
