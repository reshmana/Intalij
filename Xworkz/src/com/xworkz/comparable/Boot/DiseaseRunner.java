package com.xworkz.comparable.Boot;

import com.xworkz.comparable.dto.DiseaseDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiseaseRunner {
    public static void main(String[] args) {

        DiseaseDTO diseaseDTO=new DiseaseDTO("Chickenpox","common cold","Govt",20);
        DiseaseDTO diseaseDTO1=new DiseaseDTO("fiver","virl fiver","victoria",10);
        DiseaseDTO diseaseDTO2=new DiseaseDTO("Influenza","flu","jayadeva",5);
        DiseaseDTO diseaseDTO3=new DiseaseDTO("Anotomic","tissue","manipal",20);
        DiseaseDTO diseaseDTO4=new DiseaseDTO("headache","head ahe","Govt",100);

        List<DiseaseDTO> list=new ArrayList<>();
        list.add(diseaseDTO);
        list.add(diseaseDTO1);
        list.add(diseaseDTO2);
        list.add(diseaseDTO3);
        list.add(diseaseDTO4);
        Collections.sort(list);
        list.forEach(l-> System.out.println(l));

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        System.out.println("Ascending By DiseasesName");
        Collections.sort(list,(p1,p2)->p1.getDiseaseName().compareTo(p2.getDiseaseName()));
        list.forEach(l-> System.out.println(l));
        System.out.println("Descending By DiseasesName");
        Collections.sort(list,(p1,p2)->p2.getDiseaseName().compareTo(p1.getDiseaseName()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Ascending By type");
        Collections.sort(list,(p1,p2)->p1.getType().compareTo(p2.getType()));
        list.forEach(l-> System.out.println(l));
        System.out.println("Descending By type");
        Collections.sort(list,(p1,p2)->p2.getType().compareTo(p1.getType()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Ascending By hospital");
        Collections.sort(list,(p1,p2)->p1.getHospital().compareTo(p2.getHospital()));
        list.forEach(l-> System.out.println(l));
        System.out.println("Descending By hospital");
        Collections.sort(list,(p1,p2)->p2.getHospital().compareTo(p1.getHospital()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Ascending By NoOfPatient");
        Collections.sort(list,(p1,p2)-> Double.compare(p1.getNoOfPatient(), p2.getNoOfPatient()));
        list.forEach(l-> System.out.println(l));
        System.out.println("Descending By NoOfPatient");
        Collections.sort(list,(p1,p2)->Double.compare(p2.getNoOfPatient(), p1.getNoOfPatient()));
        list.forEach(l-> System.out.println(l));


    }
}
