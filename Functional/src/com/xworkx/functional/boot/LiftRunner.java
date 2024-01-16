package com.xworkx.functional.boot;

import com.xworkx.functional.DTO.GeyserDTO;
import com.xworkx.functional.DTO.LiftDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LiftRunner {
    public static void main(String[] args) {

        LiftDTO liftDTO = new LiftDTO(10, "north", 1000, true);
        LiftDTO liftDTO1 = new LiftDTO(1, "north east", 500, true);
        LiftDTO liftDTO2 = new LiftDTO(5, "east north", 1500, true);
        LiftDTO liftDTO3 = new LiftDTO(9, "west", 5000, true);
        LiftDTO liftDTO4 = new LiftDTO(7, "east", 2000, false);

        List<LiftDTO> list = new ArrayList<>();
        list.add(liftDTO);
        list.add(liftDTO1);
        list.add(liftDTO2);
        list.add(liftDTO3);
        list.add(liftDTO4);

        System.out.println("Ascending by CurrentFloor");
        Comparator<LiftDTO> liftDTOComparatorCurrentFloorASc = (o1, o2) -> {
            return Integer.compare(o1.getCurrentFloor(), o2.getCurrentFloor());
        };
        Collections.sort(list, liftDTOComparatorCurrentFloorASc);
            for (LiftDTO dto : list) {
                System.out.println(dto);
            }
        System.out.println("Descending by CurrentFloor");
            Comparator<LiftDTO> liftDTOComparatorCurrentFloorDsc = (o1, o2) -> {
                return Integer.compare(o2.getCurrentFloor(), o1.getCurrentFloor());
            };
            Collections.sort(list, liftDTOComparatorCurrentFloorDsc);
                for (LiftDTO dto : list) {
                    System.out.println(dto);
                }

        System.out.println("=====================================");

        System.out.println("Ascending by direction");
        Comparator<LiftDTO> liftDTOComparatordirectionASc = (o1, o2) -> {
            return o1.getDirection().compareTo(o2.getDirection());
        };
        Collections.sort(list, liftDTOComparatordirectionASc);
        for (LiftDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("Descending by direction");
        Comparator<LiftDTO> liftDTOComparatordirectionDsc = (o1, o2) -> {
            return o2.getDirection().compareTo(o1.getDirection());
        };
        Collections.sort(list, liftDTOComparatordirectionDsc);
        for (LiftDTO dto : list) {
            System.out.println(dto);
        }

        System.out.println("=====================================");

        System.out.println("Ascending by maxWeightCapacity");
        Comparator<LiftDTO> liftDTOComparatormaxWeightCapacityASc = (o1, o2) -> {
            return Double.compare(o1.getMaxWeightCapacity(), o2.getMaxWeightCapacity());
        };
        Collections.sort(list, liftDTOComparatormaxWeightCapacityASc);
        for (LiftDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("Descending by maxWeightCapacity");
        Comparator<LiftDTO> liftDTOComparatormaxWeightCapacityDsc = (o1, o2) -> {
            return Double.compare(o2.getMaxWeightCapacity(), o1.getMaxWeightCapacity());
        };
        Collections.sort(list, liftDTOComparatormaxWeightCapacityDsc);
        for (LiftDTO dto : list) {
            System.out.println(dto);
        }

        System.out.println("=====================================");

        System.out.println("Ascending by Operational");
        Comparator<LiftDTO> liftDTOComparatorOperationalASc = (o1, o2) -> {
            return Boolean.compare(o1.isOperational(),o2.isOperational());
        };
        Collections.sort(list, liftDTOComparatorOperationalASc);
        for (LiftDTO dto : list) {
            System.out.println(dto);
        }
        System.out.println("Descending by Operational");
        Comparator<LiftDTO> liftDTOComparatorOperationalDsc = (o1, o2) -> {
            return Boolean.compare(o2.isOperational(),o1.isOperational());        };
        Collections.sort(list, liftDTOComparatorOperationalDsc);
        for (LiftDTO dto : list) {
            System.out.println(dto);
        }

            }
        }

