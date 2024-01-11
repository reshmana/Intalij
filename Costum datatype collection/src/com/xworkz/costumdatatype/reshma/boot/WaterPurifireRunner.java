package com.xworkz.costumdatatype.reshma.boot;

import com.xworkz.costumdatatype.reshma.dto.PaperDTO;
import com.xworkz.costumdatatype.reshma.dto.WaterPurifireDTO;
import com.xworkz.costumdatatype.reshma.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        Comparator<WaterPurifireDTO> comparator=new waterPurifireComparatorAsc();
        Collections.sort(list,comparator);
        System.out.println("Ascending order by using model");
        for (WaterPurifireDTO ref:list){
            System.out.println(ref);
        }

        Comparator<WaterPurifireDTO> comparator1 = new waterPurifireComparatorDsc();
        Collections.sort(list,comparator1);
        System.out.println("Descending order by comparing model");
        for (WaterPurifireDTO ref:list){
            System.out.println(ref);
        }

        System.out.println("===================================");

        Comparator<WaterPurifireDTO> comparator2=new waterPurifireComparatorAsc1();
        Collections.sort(list,comparator2);
        System.out.println("Ascending order by using filtrationCapacity");
        for (WaterPurifireDTO ref:list){
            System.out.println(ref);
        }

        Comparator<WaterPurifireDTO> comparator3 = new waterPurifireComparatorDsc1();
        Collections.sort(list,comparator3);
        System.out.println("Descending order by comparing filtrationCapacity");
        for (WaterPurifireDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("===============================");

        Comparator<WaterPurifireDTO> comparator4=new waterPurifireComparatorAsc2();
        Collections.sort(list,comparator4);
        System.out.println("Ascending order by using purificationTechnology");
        for (WaterPurifireDTO ref:list){
            System.out.println(ref);
        }

        Comparator<WaterPurifireDTO> comparator5 = new waterPurifireComparatorDsc2();
        Collections.sort(list,comparator5);
        System.out.println("Descending order by comparing purificationTechnology");
        for (WaterPurifireDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("========================");

        Comparator<WaterPurifireDTO> comparator6=new waterPurifireComparatorAsc3();
        Collections.sort(list,comparator6);
        System.out.println("Ascending order by using smartFeatures");
        for (WaterPurifireDTO ref:list){
            System.out.println(ref);
        }

        Comparator<WaterPurifireDTO> comparator7 = new waterPurifireComparatorDsc3();
        Collections.sort(list,comparator7);
        System.out.println("Descending order by comparing smartFeatures");
        for (WaterPurifireDTO ref:list){
            System.out.println(ref);
        }




    }
}
