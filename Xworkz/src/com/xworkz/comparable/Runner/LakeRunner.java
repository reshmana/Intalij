package com.xworkz.comparable.Runner;

import com.xworkz.comparable.dto.LakeDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LakeRunner {
    public static void main(String[] args) {
        LakeDTO lakeDTO1=new LakeDTO("BTM","BTM",2.0,3);
        LakeDTO lakeDTO2=new LakeDTO("Pampa Sarovar","Hampi",1.2,2);
        LakeDTO lakeDTO3=new LakeDTO("Ulsoor","Halasuru",1.8,10);
        LakeDTO lakeDTO4=new LakeDTO("Hebbal","Hebbal",1.5,20);
        LakeDTO lakeDTO5=new LakeDTO("Sankey","bengaluru",2,30);

        List<LakeDTO> list=new ArrayList<>();
        list.add(lakeDTO1);
        list.add(lakeDTO2);
        list.add(lakeDTO3);
        list.add(lakeDTO4);
        list.add(lakeDTO5);

        Collections.sort(list);
        list.forEach(l-> System.out.println(l));

        System.out.println("====================");

        System.out.println("Ascending by name");
        Collections.sort(list,(p1,p2)->p1.getName().compareTo(p2.getName()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Descending  by name");
        Collections.sort(list,(p1,p2)->p2.getName().compareTo(p1.getName()));
        list.forEach(l-> System.out.println(l));


    }
}
