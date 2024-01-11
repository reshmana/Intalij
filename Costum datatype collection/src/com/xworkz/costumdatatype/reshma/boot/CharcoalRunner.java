package com.xworkz.costumdatatype.reshma.boot;

import com.xworkz.costumdatatype.reshma.dto.CharcoalDTO;
import com.xworkz.costumdatatype.reshma.dto.PaperDTO;
import com.xworkz.costumdatatype.reshma.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CharcoalRunner {
    public static void main(String[] args) {
        CharcoalDTO charcoalDTO=new CharcoalDTO(100d,true,20,150d);
        CharcoalDTO charcoalDTO1=new CharcoalDTO(1000d,false,5,800d);
        CharcoalDTO charcoalDTO2=new CharcoalDTO(1500d,false,8,650d);
        CharcoalDTO charcoalDTO3=new CharcoalDTO(800d,true,1,5000d);
        CharcoalDTO charcoalDTO4=new CharcoalDTO(550d,false,0,680d);

        List<CharcoalDTO> list=new ArrayList<>();
        list.add(charcoalDTO);
        list.add(charcoalDTO1);
        list.add(charcoalDTO2);
        list.add(charcoalDTO3);
        list.add(charcoalDTO4);
        for (CharcoalDTO dto:list){
            System.out.println(dto);
        }
        Comparator<CharcoalDTO> comparator=new CharcoarComparatorAsc();
        Collections.sort(list,comparator);
        System.out.println("Ascending order by using porosity");
        for (CharcoalDTO ref:list){
            System.out.println(ref);
        }

        Comparator<CharcoalDTO> comparator1 = new CharcoalComparatorDsc();
        Collections.sort(list,comparator1);
        System.out.println("Descending order by comparing porosity");
        for (CharcoalDTO ref:list){
            System.out.println(ref);
        }

        System.out.println("===================================");

        Comparator<CharcoalDTO> comparator2=new CharcoarComparatorAsc1();
        Collections.sort(list,comparator2);
        System.out.println("Ascending order by using carbonContent");
        for (CharcoalDTO ref:list){
            System.out.println(ref);
        }

        Comparator<CharcoalDTO> comparator3 = new CharcoalComparatorDsc1();
        Collections.sort(list,comparator3);
        System.out.println("Descending order by comparing carbonContent");
        for (CharcoalDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("===============================");

        Comparator<CharcoalDTO> comparator4=new CharcoarComparatorAsc2();
        Collections.sort(list,comparator4);
        System.out.println("Ascending order by using ashContent");
        for (CharcoalDTO ref:list){
            System.out.println(ref);
        }

        Comparator<CharcoalDTO> comparator5 = new CharcoalComparatorDsc2();
        Collections.sort(list,comparator5);
        System.out.println("Descending order by comparing ashContent");
        for (CharcoalDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("========================");

        Comparator<CharcoalDTO> comparator6=new CharcoarComparatorAsc3();
        Collections.sort(list,comparator6);
        System.out.println("Ascending order by using heatOutput");
        for (CharcoalDTO ref:list){
            System.out.println(ref);
        }

        Comparator<CharcoalDTO> comparator7 = new CharcoalComparatorDsc3();
        Collections.sort(list,comparator7);
        System.out.println("Descending order by comparing heatOutput");
        for (CharcoalDTO ref:list){
            System.out.println(ref);
        }







    }
}
