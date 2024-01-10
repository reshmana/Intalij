package com.xworkz.costumdatatype.reshma.boot;

import com.xworkz.costumdatatype.reshma.dto.SparkPlugDTO;

import java.util.ArrayList;
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
    }
}
