package com.xworkz.comparable.Boot;

import com.xworkz.comparable.dto.PlayGrondDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayGroundRunner {
    public static void main(String[] args) {
        PlayGrondDTO playGrondDTO1=new PlayGrondDTO("KinderGarden","BTM",100,2.0);
        PlayGrondDTO playGrondDTO2=new PlayGrondDTO("Jaya Prakash","Brindavan Nagar",50,2.8);
        PlayGrondDTO playGrondDTO3=new PlayGrondDTO("channaswami","benglore",100,5.1);
        PlayGrondDTO playGrondDTO4=new PlayGrondDTO("foodbal playground","kormangala",200,3.5);
        PlayGrondDTO playGrondDTO5=new PlayGrondDTO("kabbadi playground","jayanagar",500,1.8);

        List<PlayGrondDTO> list=new ArrayList<>();
        list.add(playGrondDTO1);
        list.add(playGrondDTO2);
        list.add(playGrondDTO3);
        list.add(playGrondDTO4);
        list.add(playGrondDTO5);
        Collections.sort(list);
        list.forEach(l-> System.out.println(l));

        System.out.println("==========================");

        System.out.println("Ascending by names");
        Collections.sort(list,(p1,p2)->p1.getName().compareTo(p2.getName()));
        list.forEach(l-> System.out.println(l));
        System.out.println("Descending by names");
        Collections.sort(list,(p1,p2)->p2.getName().compareTo(p1.getName()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Ascending by location");
        Collections.sort(list,(p1,p2)->p1.getLocation().compareTo(p2.getLocation()));
        list.forEach(l-> System.out.println(l));
        System.out.println("Descending by location");
        Collections.sort(list,(p1,p2)->p2.getLocation().compareTo(p1.getLocation()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Ascending by NoOfVisitors");
        Collections.sort(list, (p1, p2) ->Double.compare(p1.getNoOfVisitors(),p2.getNoOfVisitors()));
        list.forEach(l -> System.out.println(l));
        System.out.println("Descending by NoOfVisitors");
        Collections.sort(list, (p1, p2) ->Double.compare(p2.getNoOfVisitors(),p1.getNoOfVisitors()));
        list.forEach(l -> System.out.println(l));

        System.out.println("Ascending by Area");
        Collections.sort(list, (p1, p2) ->Double.compare(p1.getArea(),p2.getArea()));
        list.forEach(l -> System.out.println(l));
        System.out.println("Descending by Area");
        Collections.sort(list, (p1, p2) ->Double.compare(p2.getArea(),p1.getArea()));
        list.forEach(l -> System.out.println(l));








    }
}
