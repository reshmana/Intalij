package com.xworkz.costumdatatype.reshma.boot;

import com.xworkz.costumdatatype.reshma.dto.RifillDTO;

import java.util.ArrayList;
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

    }
}
