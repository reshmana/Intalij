package com.xworkz.listIterator.set;

import java.util.HashSet;
import java.util.Set;

public class ToyDTORunner {
    public static void main(String[] args) {

        ToyDTO toyDTO= new ToyDTO("Teddy","Fiber","S");
        ToyDTO toyDTO1= new ToyDTO("spiderman","plastic","M");
        ToyDTO toyDTO2= new ToyDTO("ironMan","Fiber","L");
        ToyDTO toyDTO3= new ToyDTO("Hulk","Mud","XL");
        ToyDTO toyDTO4= new ToyDTO("Teddy","Fiber","S");


        Set<ToyDTO> set=new HashSet<>();
        set.add(toyDTO);
        set.add(toyDTO1);
        set.add(toyDTO2);
        set.add(toyDTO3);
        set.add(toyDTO4);

        //set.stream().sorted((p1,p2).forEach(p1.get));
        set.stream().sorted((p1,p2)->p1.compareTo(p2)).forEach(System.out::println);
    }
}
