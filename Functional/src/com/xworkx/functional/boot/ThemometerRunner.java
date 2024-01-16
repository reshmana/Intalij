package com.xworkx.functional.boot;

import com.xworkx.functional.DTO.StreetDTO;
import com.xworkx.functional.DTO.ThermometerDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThemometerRunner {
    public static void main(String[] args) {
        ThermometerDTO thermometer = new ThermometerDTO("Acme", "Celsius", 28, true);
        ThermometerDTO thermometer1 = new ThermometerDTO("omron", "fahrenheit", 25.5, true);
        ThermometerDTO thermometer2 = new ThermometerDTO("Braun", "Celsius", 43.2, false);
        ThermometerDTO thermometer3 = new ThermometerDTO("morepen", "fahrenheit", 12.0, true);
        ThermometerDTO thermometer4 = new ThermometerDTO("Hicks", "Celsius", 30, true);

        List<ThermometerDTO> list=new ArrayList<>();
        list.add(thermometer);
        list.add(thermometer1);
        list.add(thermometer2);
        list.add(thermometer3);
        list.add(thermometer4);

        System.out.println("Ascending by brand");
        Comparator<ThermometerDTO> thermometerDTOComparatorBrandAsc=(o1, o2)->{
            return o1.getBrand().compareTo(o2.getBrand());
        };
        Collections.sort(list,thermometerDTOComparatorBrandAsc);
        for (ThermometerDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by brand");
        Comparator<ThermometerDTO> thermometerDTOComparatorBrandDsc=(o1,o2)->{
            return o2.getBrand().compareTo(o1.getBrand());
        };
        Collections.sort(list,thermometerDTOComparatorBrandDsc);
        for (ThermometerDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("=============================");

        System.out.println("Ascending by temperatureUnit");
        Comparator<ThermometerDTO> thermometerDTOComparatortemperatureUnitAsc=(o1,o2)->{
            return  o1.getTemperatureUnit().compareTo(o2.getTemperatureUnit());
        };
        Collections.sort(list,thermometerDTOComparatortemperatureUnitAsc);
        for (ThermometerDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by temperatureUnit");
        Comparator<ThermometerDTO> thermometerDTOComparatortemperatureUnitDsc=(o1,o2)->{
            return  o2.getTemperatureUnit().compareTo(o1.getTemperatureUnit());
        };
        Collections.sort(list,thermometerDTOComparatortemperatureUnitDsc);
        for (ThermometerDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("=============================");

        System.out.println("Ascending by currentTemperature");
        Comparator<ThermometerDTO> thermometerDTOComparatorcurrentTemperatureAsc=(o1,o2)->{
            return Double.compare(o1.getCurrentTemperature(), o2.getCurrentTemperature());
        };
        Collections.sort(list,thermometerDTOComparatorcurrentTemperatureAsc);
        for (ThermometerDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by currentTemperature");
        Comparator<ThermometerDTO> thermometerDTOComparatorcurrentTemperatureDsc=(o1,o2)->{
            return Double.compare(o2.getCurrentTemperature(), o1.getCurrentTemperature());
        };
        Collections.sort(list,thermometerDTOComparatorcurrentTemperatureDsc);
        for (ThermometerDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("=============================");

        System.out.println("Ascending by isDigital");
        Comparator<ThermometerDTO> thermometerDTOComparatorisDigitalAsc=(o1,o2)->{
            return Boolean.compare(o1.isDigital(),o2.isDigital());
        };
        Collections.sort(list,thermometerDTOComparatorBrandAsc);
        for (ThermometerDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by isDigital");
        Comparator<ThermometerDTO> thermometerDTOComparatorisDigitalDsc=(o1,o2)->{
            return Boolean.compare(o2.isDigital(),o1.isDigital());
        };
        Collections.sort(list,thermometerDTOComparatorisDigitalDsc);
        for (ThermometerDTO dto:list){
            System.out.println(dto);
        }

    }
}
