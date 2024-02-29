package com.xworkz.map.boot;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {
    public static void main(String[] args) {
        
        Map<String,Integer> personNameAndAge=new HashMap<>();
        personNameAndAge.put("Reshma",24);
        personNameAndAge.put("Sonika",13);
        personNameAndAge.put("Pavan",16);
        personNameAndAge.put("Anand",29);
        personNameAndAge.put("Ganesh",18);
        personNameAndAge.put("Pooja",22);

        personNameAndAge.values().forEach(System.out::println);
        personNameAndAge.keySet().forEach(System.out::println);
        
      Set<Map.Entry<String, Integer>> list=personNameAndAge.entrySet();
      list.forEach(System.out::println);


    }
}
