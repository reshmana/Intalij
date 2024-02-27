package com.Xworkz.streams.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OutDoorCampMaterials {
    public static <list> void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Sleeping bags");
        list.add("Tent");
        list.add("Rainwear");
        list.add("camping accessories");
        list.add("Headlamp ");
        list.add("Camping Stove");
        list.add(" UV Hat");
        list.add("Camping pillow.");
        list.add("Camp chairs.");
        list.add("Lantern");
        //List<String> square = list.stream().collect(Collectors.toList());
        //List<String> result=list.stream().count();
        System.out.println("list of items which contains 't' in it");
        list.stream().filter(t->t.contains("t")).forEach(l-> System.out.println(l));

        System.out.println("list of items in descending order");
        list.stream().sorted(Collections.reverseOrder()).forEach(l-> System.out.println(l));

        System.out.println("list of items which has least 5 characters sort in descending order");
        list.stream().filter(t->t.length()>=5).sorted(Collections.reverseOrder()).forEach(l-> System.out.println(l));

        System.out.println("convert all items to upper case and print which as only 'a' ");
        List<String> upperList=list.stream().filter(t->t.contains("a")).collect(Collectors.toList());
        upperList.forEach(l-> System.out.println(l));

        System.out.println("cont of items which has 't'");
        System.out.println(list.stream().filter(t->t.contains("t")).count());

        System.out.println("list of items which as 'a' and 'o' in ascending order");
        List<String> list1=list.stream().filter(t->t.contains("a")  && t.contains("o")).sorted().collect(Collectors.toList());
        list1.forEach(l-> System.out.println(l));
    }

}
