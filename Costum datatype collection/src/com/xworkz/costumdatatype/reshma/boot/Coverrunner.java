package com.xworkz.costumdatatype.reshma.boot;

import com.xworkz.costumdatatype.reshma.dto.CoverDTO;

import java.util.ArrayList;
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


    }
}
