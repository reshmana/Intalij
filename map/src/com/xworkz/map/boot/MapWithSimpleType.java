package com.xworkz.map.boot;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapWithSimpleType {
    public static void main(String[] args) {

        Map<String,Integer> movieAndTicket=new HashMap<>();
        movieAndTicket.put("Jawan",550);
        movieAndTicket.put("Animal",650);
        movieAndTicket.put("Dunki",300);
        movieAndTicket.put("Pathan",400);
        movieAndTicket.put("Ghost",700);
        movieAndTicket.put("Tiger3",800);

        movieAndTicket.values().forEach(System.out::println);
        movieAndTicket.keySet().forEach(System.out::println);
        boolean contain= movieAndTicket.containsKey("Baby");
        System.out.println(contain);

        Set<Map.Entry<String,Integer>> set=movieAndTicket.entrySet();
        set.forEach(System.out::println);

        boolean containV=movieAndTicket.containsValue(800);
        System.out.println(containV);

        Integer get=movieAndTicket.get("Ghost");
        System.out.println(get);

        int size=movieAndTicket.size();
        System.out.println(size);

        boolean empty=movieAndTicket.isEmpty();
        System.out.println(empty);

        movieAndTicket.remove("Tiger3");
        movieAndTicket.forEach((k,l)-> System.out.println(k+": "+l));

        System.out.println("Map from another map");
        Map<String,Integer> map1=new HashMap<>();
        map1.putAll(movieAndTicket);
        map1.forEach((k,l)-> System.out.println(k+": "+l));
        System.out.println("after clear map1");
        map1.clear();
        map1.forEach((k,l)-> System.out.println(k+": "+l));


     }

}
