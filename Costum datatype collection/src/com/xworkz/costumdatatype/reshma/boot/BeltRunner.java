package com.xworkz.costumdatatype.reshma.boot;

import com.xworkz.costumdatatype.reshma.dto.BeltDTO;
import com.xworkz.costumdatatype.reshma.dto.PaperDTO;
import com.xworkz.costumdatatype.reshma.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BeltRunner {
    public static void main(String[] args) {
        BeltDTO beltDTO=new BeltDTO("leather",10,"prong buckle","Black");
        BeltDTO beltDTO1=new BeltDTO("fabric",5,"D-ring  buckle","Brown");
        BeltDTO beltDTO2=new BeltDTO("plastic",25,"snap  buckle","blue");
        BeltDTO beltDTO3=new BeltDTO("cotton",30,"O-ring buckle","Gray");
        BeltDTO beltDTO4=new BeltDTO("polystor",8,"doubleside buckle","white");

        List<BeltDTO> list=new ArrayList<>();
        list.add(beltDTO);
        list.add(beltDTO1);
        list.add(beltDTO2);
        list.add(beltDTO3);
        list.add(beltDTO4);
        for (BeltDTO dto:list){
            System.out.println(dto);
        }
        Comparator<BeltDTO> comparator=new BeltComparatorAsc();
        Collections.sort(list,comparator);
        System.out.println("Ascending order by using material");
        for (BeltDTO ref:list){
            System.out.println(ref);
        }

        Comparator<BeltDTO> comparator1 = new BeltComparatorDsc();
        Collections.sort(list,comparator1);
        System.out.println("Descending order by comparing material");
        for (BeltDTO ref:list){
            System.out.println(ref);
        }

        System.out.println("===================================");

        Comparator<BeltDTO> comparator2=new BeltComparatorAsc1();
        Collections.sort(list,comparator2);
        System.out.println("Ascending order by using length");
        for (BeltDTO ref:list){
            System.out.println(ref);
        }

        Comparator<BeltDTO> comparator3 = new BeltComparatorDsc1();
        Collections.sort(list,comparator3);
        System.out.println("Descending order by comparing length");
        for (BeltDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("===============================");

        Comparator<BeltDTO> comparator4=new BeltComparatorAsc2();
        Collections.sort(list,comparator4);
        System.out.println("Ascending order by using buckleType");
        for (BeltDTO ref:list){
            System.out.println(ref);
        }

        Comparator<BeltDTO> comparator5 = new BeltComparatorDsc2();
        Collections.sort(list,comparator5);
        System.out.println("Descending order by comparing buckleType");
        for (BeltDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("========================");

        Comparator<BeltDTO> comparator6=new BeltComparatorAsc3();
        Collections.sort(list,comparator6);
        System.out.println("Ascending order by using color");
        for (BeltDTO ref:list){
            System.out.println(ref);
        }

        Comparator<BeltDTO> comparator7 = new BeltComparatorDsc3();
        Collections.sort(list,comparator7);
        System.out.println("Descending order by comparing color");
        for (BeltDTO ref:list){
            System.out.println(ref);
        }



    }
}
