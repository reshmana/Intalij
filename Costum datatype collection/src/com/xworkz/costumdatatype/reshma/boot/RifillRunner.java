package com.xworkz.costumdatatype.reshma.boot;

import com.xworkz.costumdatatype.reshma.dto.PaperDTO;
import com.xworkz.costumdatatype.reshma.dto.RifillDTO;
import com.xworkz.costumdatatype.reshma.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RifillRunner {
    public static void main(String[] args) {
        RifillDTO rifillDTO = new RifillDTO("Red",5,"cross",false);
        RifillDTO rifillDTO1 = new RifillDTO("Black",1,"psrker",false);
        RifillDTO rifillDTO2 = new RifillDTO("Blue",10,"ballpoint",false);
        RifillDTO rifillDTO3 = new RifillDTO("Green",15,"sheaffer",false);

        List<RifillDTO> list=new ArrayList<>();
        list.add(rifillDTO);
        list.add(rifillDTO1);
        list.add(rifillDTO2);
        list.add(rifillDTO3);
        for (RifillDTO dto:list){
            System.out.println(dto);
        }

        Comparator<RifillDTO> comparator=new RifillComparatorAsc();
        Collections.sort(list,comparator);
        System.out.println("Ascending order by using inkColor");
        for (RifillDTO ref:list){
            System.out.println(ref);
        }

        Comparator<RifillDTO> comparator1 = new RifillComparatorDsc();
        Collections.sort(list,comparator1);
        System.out.println("Descending order by comparing inkColor");
        for (RifillDTO ref:list){
            System.out.println(ref);
        }

        System.out.println("===================================");

        Comparator<RifillDTO> comparator2=new RifillComparatorAsc1();
        Collections.sort(list,comparator2);
        System.out.println("Ascending order by using inkVolume");
        for (RifillDTO ref:list){
            System.out.println(ref);
        }

        Comparator<RifillDTO> comparator3 = new RifillComparatorDsc1();
        Collections.sort(list,comparator3);
        System.out.println("Descending order by comparing inkVolume");
        for (RifillDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("===============================");

        Comparator<RifillDTO> comparator4=new RifillComparatorAsc2();
        Collections.sort(list,comparator4);
        System.out.println("Ascending order by using brand");
        for (RifillDTO ref:list){
            System.out.println(ref);
        }

        Comparator<RifillDTO> comparator5 = new RifillComparatorDsc2();
        Collections.sort(list,comparator5);
        System.out.println("Descending order by comparing brand");
        for (RifillDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("========================");

        Comparator<RifillDTO> comparator6=new RifillComparatorAsc3();
        Collections.sort(list,comparator6);
        System.out.println("Ascending order by using compatible");
        for (RifillDTO ref:list){
            System.out.println(ref);
        }

        Comparator<RifillDTO> comparator7 = new RifillComparatorDsc3();
        Collections.sort(list,comparator7);
        System.out.println("Descending order by comparing compatible");
        for (RifillDTO ref:list){
            System.out.println(ref);
        }



    }
}
