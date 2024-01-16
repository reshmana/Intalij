package com.xworkx.functional.boot;

import com.xworkx.functional.DTO.StreetDTO;
import com.xworkx.functional.DTO.TelescopeDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TelescopeRunner {
    public static void main(String[] args) {
        TelescopeDTO telescopeDTO=new TelescopeDTO("hubble space",125,400,false);
        TelescopeDTO telescopeDTO1=new TelescopeDTO("refractor",120,550,true);
        TelescopeDTO telescopeDTO2=new TelescopeDTO("reflector",130,600,true);
        TelescopeDTO telescopeDTO3=new TelescopeDTO("dobsonian",135,750,false);
        TelescopeDTO telescopeDTO4=new TelescopeDTO("Maksutov",250,1000,true);

        List<TelescopeDTO> list=new ArrayList<>();
        list.add(telescopeDTO);
        list.add(telescopeDTO1);
        list.add(telescopeDTO2);
        list.add(telescopeDTO3);
        list.add(telescopeDTO4);

        System.out.println("Ascending by Name");
        Comparator<TelescopeDTO> telescopeDTOComparatornameAsc=(o1, o2)->{
            return o1.getName().compareTo(o2.getName());
        };
        Collections.sort(list,telescopeDTOComparatornameAsc);
        for (TelescopeDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by Name");
        Comparator<TelescopeDTO> telescopeDTOComparatornameDsc=(o1,o2)->{
            return o2.getName().compareTo(o1.getName());
        };
        Collections.sort(list,telescopeDTOComparatornameDsc);
        for (TelescopeDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("=============================");

        System.out.println("Ascending by apertureSize");
        Comparator<TelescopeDTO> telescopeDTOComparatorapertureSizeAsc=(o1,o2)->{
            return  Double.compare(o1.getApertureSize(),o2.getApertureSize());
        };
        Collections.sort(list,telescopeDTOComparatorapertureSizeAsc);
        for (TelescopeDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by apertureSize");
        Comparator<TelescopeDTO> telescopeDTOComparatorapertureSizeDsc=(o1,o2)->{
            return  Double.compare(o2.getApertureSize(),o1.getApertureSize());
        };
        Collections.sort(list,telescopeDTOComparatorapertureSizeDsc);
        for (TelescopeDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("=============================");

        System.out.println("Ascending by focalLength");
        Comparator<TelescopeDTO> telescopeDTOComparatorfocalLengthAsc=(o1,o2)->{
            return Double.compare(o1.getFocalLength(), o2.getFocalLength());
        };
        Collections.sort(list,telescopeDTOComparatorfocalLengthAsc);
        for (TelescopeDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by focalLength");
        Comparator<TelescopeDTO> telescopeDTOComparatorfocalLengthDsc=(o1,o2)->{
            return Double.compare(o1.getFocalLength(), o2.getFocalLength());
        };
        Collections.sort(list,telescopeDTOComparatorfocalLengthDsc);
        for (TelescopeDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("=============================");

        System.out.println("Ascending by Motorized");
        Comparator<TelescopeDTO> telescopeDTOComparatorMotorizedAsc=(o1,o2)->{
            return Boolean.compare(o1.isMotorized(),o2.isMotorized());
        };
        Collections.sort(list,telescopeDTOComparatorMotorizedAsc);
        for (TelescopeDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by Motorized");
        Comparator<TelescopeDTO> telescopeDTOComparatorMotorizedDsc=(o1,o2)->{
            return Boolean.compare(o2.isMotorized(),o1.isMotorized());
        };
        Collections.sort(list,telescopeDTOComparatorMotorizedDsc);
        for (TelescopeDTO dto:list){
            System.out.println(dto);
        }
    }

}
