package com.xworkx.functional.boot;

import com.xworkx.functional.DTO.ShipDTO;

import java.util.*;

public class ShipRunner {
    public static void main(String[] args) {
        ShipDTO shipDTO=new ShipDTO("aircraft carrier",700,37,true);
        ShipDTO shipDTO1=new ShipDTO("battleship",650,30,false);
        ShipDTO shipDTO2=new ShipDTO("cruiser",558,40,true);
        ShipDTO shipDTO3=new ShipDTO("frigate",500,20,true);
        ShipDTO shipDTO4=new ShipDTO("galleon",458,28,false);

        List<ShipDTO> list=new ArrayList<>();
        list.add(shipDTO);
        list.add(shipDTO1);
        list.add(shipDTO2);
        list.add(shipDTO3);
        list.add(shipDTO4);

        System.out.println("Ascending by name");
        Comparator<ShipDTO> shipDTOComparatorNameAsc=(o1,o2)->{
            return o1.getName().compareTo(o2.getName());
        };
        Collections.sort(list,shipDTOComparatorNameAsc);
        for (ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by name");
        Comparator<ShipDTO> shipDTOComparatorNameDsc=(o1,o2)->{
            return o2.getName().compareTo(o1.getName());
        };
        Collections.sort(list,shipDTOComparatorNameDsc);
        for (ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("====================================");


        System.out.println("Ascending by length");
        Comparator<ShipDTO> shipDTOComparatorlengthAsc=(o1,o2)->{
            return Double.compare(o1.getLength(), o2.getLength());
        };
        Collections.sort(list,shipDTOComparatorlengthAsc);
        for (ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by length");
        Comparator<ShipDTO> shipDTOComparatorlengthDsc=(o1,o2)->{
            return Double.compare(o2.getLength(), o1.getLength());
        };
        Collections.sort(list,shipDTOComparatorlengthDsc);
        for (ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("====================================");


        System.out.println("Ascending by maxSpeed");
        Comparator<ShipDTO> shipDTOComparatormaxSpeedAsc=(o1,o2)->{
            return Double.compare(o1.getMaxSpeed(), o2.getMaxSpeed());
        };
        Collections.sort(list,shipDTOComparatormaxSpeedAsc);
        for (ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by maxSpeed");
        Comparator<ShipDTO> shipDTOComparatormaxSpeedDsc=(o1,o2)->{
            return Double.compare(o2.getMaxSpeed(), o1.getMaxSpeed());
        };
        Collections.sort(list,shipDTOComparatormaxSpeedDsc);
        for (ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("====================================");


        System.out.println("Ascending by Sailing");
        Comparator<ShipDTO> shipDTOComparatorSailingAsc=(o1,o2)->{
            return Boolean.compare(o1.isSailing(),o2.isSailing());
        };
        Collections.sort(list,shipDTOComparatorSailingAsc);
        for (ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by Sailing");
        Comparator<ShipDTO> shipDTOComparatorSailingDsc=(o1,o2)->{
            return Boolean.compare(o2.isSailing(),o1.isSailing());
        };
        Collections.sort(list,shipDTOComparatorSailingDsc);
        for (ShipDTO dto:list){
            System.out.println(dto);
        }

    }
}
