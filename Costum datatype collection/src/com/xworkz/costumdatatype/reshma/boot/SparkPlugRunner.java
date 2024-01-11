package com.xworkz.costumdatatype.reshma.boot;

import com.xworkz.costumdatatype.reshma.dto.PaperDTO;
import com.xworkz.costumdatatype.reshma.dto.SparkPlugDTO;
import com.xworkz.costumdatatype.reshma.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SparkPlugRunner {
    public static void main(String[] args) {
        SparkPlugDTO sparkPlugDTO=new SparkPlugDTO("copper"," single-ceramic",150,true);
        SparkPlugDTO sparkPlugDTO1=new SparkPlugDTO("iridium","Ceramic insulator",150,true);
        SparkPlugDTO sparkPlugDTO2=new SparkPlugDTO("platinum","",250,false);
        SparkPlugDTO sparkPlugDTO3=new SparkPlugDTO("silver","Ceramic insulator",50,true);
        SparkPlugDTO sparkPlugDTO4=new SparkPlugDTO("double platinum","single-ceramic",800,false);

        List<SparkPlugDTO> list=new ArrayList<>();
        list.add(sparkPlugDTO);
        list.add(sparkPlugDTO1);
        list.add(sparkPlugDTO2);
        list.add(sparkPlugDTO3);
        list.add(sparkPlugDTO4);
        for (SparkPlugDTO dto:list){
            System.out.println(dto);
        }
        Comparator<SparkPlugDTO> comparator=new SparkPlugComparatorAsc();
        Collections.sort(list,comparator);
        System.out.println("Ascending order by using type");
        for (SparkPlugDTO ref:list){
            System.out.println(ref);
        }

        Comparator<SparkPlugDTO> comparator1 = new SparkPlugComparatorDsc();
        Collections.sort(list,comparator1);
        System.out.println("Descending order by comparing type");
        for (SparkPlugDTO ref:list){
            System.out.println(ref);
        }

        System.out.println("===================================");

        Comparator<SparkPlugDTO> comparator2=new SparkPlugComparatorAsc1();
        Collections.sort(list,comparator2);
        System.out.println("Ascending order by using material");
        for (SparkPlugDTO ref:list){
            System.out.println(ref);
        }

        Comparator<SparkPlugDTO> comparator3 = new SparkPlugComparatorDsc1();
        Collections.sort(list,comparator3);
        System.out.println("Descending order by comparing material");
        for (SparkPlugDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("===============================");

        Comparator<SparkPlugDTO> comparator4=new SparkPlugComparatorAsc2();
        Collections.sort(list,comparator4);
        System.out.println("Ascending order by using voltage");
        for (SparkPlugDTO ref:list){
            System.out.println(ref);
        }

        Comparator<SparkPlugDTO> comparator5 = new SparkPlugComparatorDsc2();
        Collections.sort(list,comparator5);
        System.out.println("Descending order by comparing voltage");
        for (SparkPlugDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("========================");

        Comparator<SparkPlugDTO> comparator6=new SparkPlugComparatorDsc3();
        Collections.sort(list,comparator6);
        System.out.println("Ascending order by using reliable");
        for (SparkPlugDTO ref:list){
            System.out.println(ref);
        }

        Comparator<SparkPlugDTO> comparator7 = new SparkPlugComparatorDsc3();
        Collections.sort(list,comparator7);
        System.out.println("Descending order by comparing reliable");
        for (SparkPlugDTO ref:list){
            System.out.println(ref);
        }


    }
}
