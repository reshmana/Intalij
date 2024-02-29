package com.xworkz.map.boot;

import com.xworkz.map.dto.AirLineDTO;
import com.xworkz.map.dto.AirportDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapWithComplexType {
    public static void main(String[] args) {

        AirLineDTO airLineDTO= new AirLineDTO("Indigo","Bangalore","Mumbai");
        AirLineDTO airLineDTO1 = new AirLineDTO("Boeing 737", "Mumbai", "Bangalore");
        AirLineDTO airLineDTO2 = new AirLineDTO("Airbus A320", "Delhi", "Kolkata");
        AirLineDTO airLineDTO3 = new AirLineDTO("Embraer E190", "Chennai", "Hyderabad");
        AirLineDTO airLineDTO4 = new AirLineDTO("Bombardier Q400", "Mumbai", "Goa");
        AirLineDTO airLineDTO5 = new AirLineDTO("Boeing 777", "Kolkata", "Bangalore");

        AirportDTO airportDTO=new AirportDTO("Kempegouda","Bemgalore","India");
        AirportDTO airportDTO1=new AirportDTO("Narita International Airpor","Tokyo","Japan");
        AirportDTO airportDTO2=new AirportDTO("Frankfurt Airport","Frankfurt","Germany");
        AirportDTO airportDTO3=new AirportDTO("Changi Airport ","Singapore","Singapore");
        AirportDTO airportDTO4=new AirportDTO("Sydney Airport","Sydney","Australia");
        AirportDTO airportDTO5=new AirportDTO("Beijing Capita","Beijing","Chinna");

        Map<AirLineDTO,AirportDTO> airlineAirport=new HashMap<>();
        airlineAirport.put(airLineDTO,airportDTO);
        airlineAirport.put(airLineDTO1,airportDTO1);
        airlineAirport.put(airLineDTO2,airportDTO2);
        airlineAirport.put(airLineDTO3,airportDTO3);
        airlineAirport.put(airLineDTO4,airportDTO4);
        airlineAirport.put(airLineDTO5,airportDTO5);

        airlineAirport.values().forEach(System.out::println);
        airlineAirport.keySet().forEach(System.out::println);
        boolean contain= airlineAirport.containsKey(airportDTO2);
        System.out.println("Key is present "+contain);

        boolean containV=airlineAirport.containsValue(airportDTO2);
        System.out.println("Values is present "+containV);

        Set<Map.Entry<AirLineDTO,AirportDTO>> set= airlineAirport.entrySet();
        set.forEach(System.out::println);

//        airportDTO get= airlineAirport.get(airLineDTO);
//        System.out.println(get);

        int size= airlineAirport.size();
        System.out.println(size);

        boolean empty= airlineAirport.isEmpty();
        System.out.println("is empty "+empty);

        airlineAirport.remove(airLineDTO3);
        airlineAirport.forEach((k,l)-> System.out.println(k+": "+l));

        System.out.println("Map from another map");
        Map<AirLineDTO,AirportDTO> map1=new HashMap<>();
        map1.putAll(airlineAirport);
        map1.forEach((k,l)-> System.out.println(k+": "+l));
        System.out.println("after clear map1");
        map1.clear();
        map1.forEach((k,l)-> System.out.println(k+": "+l));





    }
}
