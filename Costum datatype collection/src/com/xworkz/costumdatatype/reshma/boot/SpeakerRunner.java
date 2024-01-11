package com.xworkz.costumdatatype.reshma.boot;

import com.xworkz.costumdatatype.reshma.dto.PaperDTO;
import com.xworkz.costumdatatype.reshma.dto.SpeakerDTO;
import com.xworkz.costumdatatype.reshma.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SpeakerRunner {
    public static void main(String[] args) {
        SpeakerDTO speakerDTO=new SpeakerDTO("Boat","boat stone610",150,true);
        SpeakerDTO speakerDTO1=new SpeakerDTO("Bose","Bose S1pro",50,true);
        SpeakerDTO speakerDTO2=new SpeakerDTO("Sony","Sony SRS-RA3000",250,false);
        SpeakerDTO speakerDTO3=new SpeakerDTO("Ultimate Ears","UltimateEars EPICBOOM",40,false);
        SpeakerDTO speakerDTO4=new SpeakerDTO("Anker"," Anker Soundcore Flare2",25,false);

        List<SpeakerDTO> list=new ArrayList<>();
        list.add(speakerDTO);
        list.add(speakerDTO1);
        list.add(speakerDTO2);
        list.add(speakerDTO3);
        list.add(speakerDTO4);
        for (SpeakerDTO dto:list){
            System.out.println(dto);
        }
        Comparator<SpeakerDTO> comparator=new SpeakerComparatorAsc();
        Collections.sort(list,comparator);
        System.out.println("Ascending order by using brand");
        for (SpeakerDTO ref:list){
            System.out.println(ref);
        }

        Comparator<SpeakerDTO> comparator1 = new SpeakerComparatorDsc();
        Collections.sort(list,comparator1);
        System.out.println("Descending order by comparing brand");
        for (SpeakerDTO ref:list){
            System.out.println(ref);
        }

        System.out.println("===================================");

        Comparator<SpeakerDTO> comparator2=new SpeakerComparatorAsc1();
        Collections.sort(list,comparator2);
        System.out.println("Ascending order by using model");
        for (SpeakerDTO ref:list){
            System.out.println(ref);
        }

        Comparator<SpeakerDTO> comparator3 = new SpeakerComparatorDsc1();
        Collections.sort(list,comparator3);
        System.out.println("Descending order by comparing model");
        for (SpeakerDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("===============================");

        Comparator<SpeakerDTO> comparator4=new SpeakerComparatorAsc2();
        Collections.sort(list,comparator4);
        System.out.println("Ascending order by using powerRating");
        for (SpeakerDTO ref:list){
            System.out.println(ref);
        }

        Comparator<SpeakerDTO> comparator5 = new SpeakerComparatorDsc2();
        Collections.sort(list,comparator5);
        System.out.println("Descending order by comparing powerRating");
        for (SpeakerDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("========================");

        Comparator<SpeakerDTO> comparator6=new SpeakerComparatorAsc3();
        Collections.sort(list,comparator6);
        System.out.println("Ascending order by using wireless");
        for (SpeakerDTO ref:list){
            System.out.println(ref);
        }

        Comparator<SpeakerDTO> comparator7 = new SpeakerComparatorDsc3();
        Collections.sort(list,comparator7);
        System.out.println("Descending order by comparing wireless");
        for (SpeakerDTO ref:list){
            System.out.println(ref);
        }



    }
}
