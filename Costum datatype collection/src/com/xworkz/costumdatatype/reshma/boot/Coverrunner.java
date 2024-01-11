package com.xworkz.costumdatatype.reshma.boot;

import com.xworkz.costumdatatype.reshma.dto.CoverDTO;
import com.xworkz.costumdatatype.reshma.dto.PaperDTO;
import com.xworkz.costumdatatype.reshma.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Coverrunner {
    public static void main(String[] args) {
        CoverDTO coverDTO = new CoverDTO("filecover",20d,true,1);
        CoverDTO coverDTO1 = new CoverDTO("bookcover",50d,false,7);
        CoverDTO coverDTO2 = new CoverDTO("document",200d,true,6);
        CoverDTO coverDTO3 = new CoverDTO("mobilecover",150d,false,4);
        CoverDTO coverDTO4 = new CoverDTO("laptopcover",350d,false,5);

        List<CoverDTO> list=new ArrayList<>();
        list.add(coverDTO);
        list.add(coverDTO1);
        list.add(coverDTO2);
        list.add(coverDTO3);
        list.add(coverDTO4);
        for (CoverDTO dto:list){
            System.out.println(dto);
        }
        Comparator<CoverDTO> comparator=new CoverComparatorAsc();
        Collections.sort(list,comparator);
        System.out.println("Ascending order by using name");
        for (CoverDTO ref:list){
            System.out.println(ref);
        }

        Comparator<CoverDTO> comparator1 = new CoverComparatorDsc();
        Collections.sort(list,comparator1);
        System.out.println("Descending order by comparing name");
        for (CoverDTO ref:list){
            System.out.println(ref);
        }

        System.out.println("===================================");

        Comparator<CoverDTO> comparator2=new CoverComparatorAsc1();
        Collections.sort(list,comparator2);
        System.out.println("Ascending order by using cost");
        for (CoverDTO ref:list){
            System.out.println(ref);
        }

        Comparator<CoverDTO> comparator3 = new CoverComparatorDsc1();
        Collections.sort(list,comparator3);
        System.out.println("Descending order by comparing cost");
        for (CoverDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("===============================");

        Comparator<CoverDTO> comparator4=new CoverComparatorAsc2();
        Collections.sort(list,comparator4);
        System.out.println("Ascending order by using original");
        for (CoverDTO ref:list){
            System.out.println(ref);
        }

        Comparator<CoverDTO> comparator5 = new CoverComparatorDsc2();
        Collections.sort(list,comparator5);
        System.out.println("Descending order by comparing original");
        for (CoverDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("========================");

        Comparator<CoverDTO> comparator6=new CoverComparatorAsc3();
        Collections.sort(list,comparator6);
        System.out.println("Ascending order by using thickness");
        for (CoverDTO ref:list){
            System.out.println(ref);
        }

        Comparator<CoverDTO> comparator7 = new CoverComparatorDsc3();
        Collections.sort(list,comparator7);
        System.out.println("Descending order by comparing thickness");
        for (CoverDTO ref:list){
            System.out.println(ref);
        }




    }
}
