package com.xworkz.costumdatatype.reshma.boot;

import com.xworkz.costumdatatype.reshma.dto.BeltDTO;

import java.util.ArrayList;
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


    }
}
