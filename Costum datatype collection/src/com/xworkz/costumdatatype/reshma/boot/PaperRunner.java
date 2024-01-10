package com.xworkz.costumdatatype.reshma.boot;

import com.xworkz.costumdatatype.reshma.dto.PaperDTO;
import com.xworkz.costumdatatype.reshma.dto.SensorDTO;
import com.xworkz.costumdatatype.reshma.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PaperRunner {
    public static void main(String[] args) {
        PaperDTO paperDTO=new PaperDTO(10d,5d,true,"Book paper");
        PaperDTO paperDTO1=new PaperDTO(20d,1,false,"News paper");
        PaperDTO paperDTO2=new PaperDTO(56,4d,true,"Bond paper");
        PaperDTO paperDTO3=new PaperDTO(85d,8d,false,"Artist paper");
        PaperDTO paperDTO4=new PaperDTO(100d,50d,true,"Acid-free paper");

        List<PaperDTO> list=new ArrayList<>();
        list.add(paperDTO);
        list.add(paperDTO1);
        list.add(paperDTO2);
        list.add(paperDTO3);
        list.add(paperDTO4);
        for (PaperDTO dto:list){
            System.out.println(dto);
        }
        Comparator<PaperDTO> comparator=new PaperCOmparatorAsc();
        Collections.sort(list,comparator);
        System.out.println("Ascending order by using wiegth");
        for (PaperDTO ref:list){
            System.out.println(ref);
        }

        Comparator<PaperDTO> comparator1 = new PaperCOmparatorDesc();
        Collections.sort(list,comparator1);
        System.out.println("Descending order by comparing wiegth");
        for (PaperDTO ref:list){
            System.out.println(ref);
        }

        System.out.println("===================================");

        Comparator<PaperDTO> comparator2=new PaperCOmparatorAs1();
        Collections.sort(list,comparator2);
        System.out.println("Ascending order by using width");
        for (PaperDTO ref:list){
            System.out.println(ref);
        }

        Comparator<PaperDTO> comparator3 = new PapreComparatorDesc1();
        Collections.sort(list,comparator3);
        System.out.println("Descending order by comparing width");
        for (PaperDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("===============================");

        Comparator<PaperDTO> comparator4=new PaperCOmparatorAsc2();
        Collections.sort(list,comparator4);
        System.out.println("Ascending order by using landscape");
        for (PaperDTO ref:list){
            System.out.println(ref);
        }

        Comparator<PaperDTO> comparator5 = new PapreComparatorDesc2();
        Collections.sort(list,comparator5);
        System.out.println("Descending order by comparing landscape");
        for (PaperDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("========================");

        Comparator<PaperDTO> comparator6=new PaperCOmparatorAsc3();
        Collections.sort(list,comparator6);
        System.out.println("Ascending order by using type");
        for (PaperDTO ref:list){
            System.out.println(ref);
        }

        Comparator<PaperDTO> comparator7 = new PapreComparatorDesc3();
        Collections.sort(list,comparator7);
        System.out.println("Descending order by comparing type");
        for (PaperDTO ref:list){
            System.out.println(ref);
        }


    }
}
