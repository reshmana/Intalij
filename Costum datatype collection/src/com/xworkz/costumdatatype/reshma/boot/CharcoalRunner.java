package com.xworkz.costumdatatype.reshma.boot;

import com.xworkz.costumdatatype.reshma.dto.CharcoalDTO;

import java.util.ArrayList;
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





    }
}
