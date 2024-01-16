package com.xworkx.functional.boot;

import com.xworkx.functional.DTO.StreetDTO;
import com.xworkx.functional.DTO.VentilatorDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VentilatorRunner {
    public static void main(String[] args) {
        VentilatorDTO Ventilator = new VentilatorDTO("MediAir", "Assist-Control", 10, false);
        VentilatorDTO Ventilator1 = new VentilatorDTO("resmad", "pressure-support", 5, true);
        VentilatorDTO Ventilator2 = new VentilatorDTO("philips", "SIMV", 30, false);
        VentilatorDTO Ventilator3 = new VentilatorDTO("drager", "APRV", 25, true);
        VentilatorDTO Ventilator4 = new VentilatorDTO("BPL", "BIPAP", 50, true);

          List<VentilatorDTO> list=new ArrayList<>();
          list.add(Ventilator);
          list.add(Ventilator1);
          list.add(Ventilator2);
          list.add(Ventilator3);
          list.add(Ventilator4);

        System.out.println("Ascending by brand");
        Comparator<VentilatorDTO> ventilatorDTOComparatorbrandAsc=(o1, o2)->{
            return o1.getBrand().compareTo(o2.getBrand());
        };
        Collections.sort(list,ventilatorDTOComparatorbrandAsc);
        for (VentilatorDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by brand");
        Comparator<VentilatorDTO> ventilatorDTOComparatorbrandDsc=(o1,o2)->{
            return o2.getBrand().compareTo(o1.getBrand());
        };
        Collections.sort(list,ventilatorDTOComparatorbrandDsc);
        for (VentilatorDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("=============================");

        System.out.println("Ascending by mode");
        Comparator<VentilatorDTO> ventilatorDTOComparatormodeAsc=(o1,o2)->{
            return  o1.getMode().compareTo(o2.getMode());
        };
        Collections.sort(list,ventilatorDTOComparatormodeAsc);
        for (VentilatorDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by mode");
        Comparator<VentilatorDTO> ventilatorDTOComparatormodeDsc=(o1,o2)->{
            return  o1.getMode().compareTo(o2.getMode());
        };
        Collections.sort(list,ventilatorDTOComparatormodeDsc);
        for (VentilatorDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("=============================");

        System.out.println("Ascending by pressureLevel");
        Comparator<VentilatorDTO> ventilatorDTOComparatorpressureLevelAsc=(o1,o2)->{
            return Integer.compare(o1.getPressureLevel(), o2.getPressureLevel());
        };
        Collections.sort(list,ventilatorDTOComparatorpressureLevelAsc);
        for (VentilatorDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by pressureLevel");
        Comparator<VentilatorDTO> ventilatorDTOComparatorpressureLevelDsc=(o1,o2)->{
            return Integer.compare(o1.getPressureLevel(), o2.getPressureLevel());
        };
        Collections.sort(list,ventilatorDTOComparatorpressureLevelDsc);
        for (VentilatorDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("=============================");

        System.out.println("Ascending by isPortable");
        Comparator<VentilatorDTO> ventilatorDTOComparatorisportableAsc=(o1,o2)->{
            return Boolean.compare(o1.isPortable(),o2.isPortable());
        };
        Collections.sort(list,ventilatorDTOComparatorisportableAsc);
        for (VentilatorDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by isPortable");
        Comparator<VentilatorDTO> ventilatorDTOComparatorisportableDsc=(o1,o2)->{
            return Boolean.compare(o2.isPortable(),o1.isPortable());
        };
        Collections.sort(list,ventilatorDTOComparatorisportableDsc);
        for (VentilatorDTO dto:list){
            System.out.println(dto);
        }


    }
}
