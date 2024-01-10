package com.xworkz.costumdatatype.reshma.boot;

import com.xworkz.costumdatatype.reshma.dto.SpeakerDTO;

import java.util.ArrayList;
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


    }
}
