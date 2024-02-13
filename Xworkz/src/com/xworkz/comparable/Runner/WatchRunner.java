package com.xworkz.comparable.Runner;

import com.xworkz.comparable.dto.WatchDTO;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WatchRunner {
    public static void main(String[] args) {

        WatchDTO watchDTO=new WatchDTO("Sony",1898,"Digital",false);
        WatchDTO watchDTO1=new WatchDTO("Boat",1796,"Digital",true);
        WatchDTO watchDTO2=new WatchDTO("Omega",1699,"analog",true);
        WatchDTO watchDTO3=new WatchDTO("Rolex",5999,"Digital",false);
        WatchDTO watchDTO4=new WatchDTO("Philipii",3599,"anolog",true);

        List<WatchDTO> list=new ArrayList<>();
        list.add(watchDTO);
        list.add(watchDTO1);
        list.add(watchDTO2);
        list.add(watchDTO3);
        list.add(watchDTO4);
        Collections.sort(list);
        list.forEach(l-> System.out.println(l));

        System.out.println("=====================================");

        System.out.println("Ascending by Brand");
        Collections.sort(list ,(p1,p2)->p1.getBrand().compareTo(p2.getBrand()));
        list.forEach(l-> System.out.println(l));
        System.out.println("Dscending by Brand");
        Collections.sort(list ,(p1,p2)->p2.getBrand().compareTo(p1.getBrand()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Ascending by cost");
        Collections.sort(list ,(p1,p2)->Double.compare(p1.getCost(), p2.getCost()));
        list.forEach(l-> System.out.println(l));
        System.out.println("Dscending by cost");
        Collections.sort(list ,(p1,p2)->Double.compare(p2.getCost(), p1.getCost()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Ascending by type");
        Collections.sort(list ,(p1,p2)->p1.getType().compareTo(p2.getType()));
        list.forEach(l-> System.out.println(l));
        System.out.println("Dscending by type");
        Collections.sort(list ,(p1,p2)->p2.getType().compareTo(p1.getType()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Ascending by WaterRegistance");
        Collections.sort(list,(p1,p2)->Boolean.compare(p1.isWaterRegistance(),p2.isWaterRegistance()));
        list.forEach(l-> System.out.println(l));
        System.out.println("Dscending by WaterRegistance");
        Collections.sort(list ,(p1,p2)->Boolean.compare(p2.isWaterRegistance(),p1.isWaterRegistance()));
        list.forEach(l-> System.out.println(l));









    }
}
