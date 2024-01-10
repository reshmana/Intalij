package com.xworkz.costumdatatype.reshma.boot;

import com.xworkz.costumdatatype.reshma.dto.WaterPurifireDTO;

import java.util.ArrayList;
import java.util.List;

public class WaterPurifireRunner {
    public static void main(String[] args) {
        WaterPurifireDTO waterPurifireDTO=new WaterPurifireDTO("kent RO+",20," REVERSE_OSMOSIS,",true);
        WaterPurifireDTO waterPurifireDTO1=new WaterPurifireDTO("AQUASURE ",50," ACTIVATED_CARBON,",true);
        WaterPurifireDTO waterPurifireDTO2=new WaterPurifireDTO("aquaguard RO+",40," ION_EXCHANGE,",true);
        WaterPurifireDTO waterPurifireDTO3=new WaterPurifireDTO("PUREIT",25," OZONATION",false);
        WaterPurifireDTO waterPurifireDTO4=new WaterPurifireDTO("LG ",30," ELECTRODIALYSIS",true);

        List<WaterPurifireDTO> list =new ArrayList<>();
        list.add(waterPurifireDTO);
        list.add(waterPurifireDTO1);
        list.add(waterPurifireDTO2);
        list.add(waterPurifireDTO3);
        list.add(waterPurifireDTO4);
        for (WaterPurifireDTO dto:list){
            System.out.println(list);
        }


    }
}
