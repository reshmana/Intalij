package com.xworkz.listIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ShoesBrandRunner {
    public static void main(String[] args) {
        List<String> shoeBrands=new ArrayList<>();
        shoeBrands.add("Adidas");
        shoeBrands.add("ASIAN");
        shoeBrands.add("Bata");
        shoeBrands.add("Sparx");
        shoeBrands.add("Puma");
        shoeBrands.add("Campus");
        shoeBrands.add("Woodland");
        shoeBrands.add("Liberty");
        shoeBrands.add("Centrino");
        shoeBrands.add("Lotto");

        ListIterator<String> listIterator=shoeBrands.listIterator();
        while (listIterator.hasNext()){
            String forword=listIterator.next();
            System.out.println(forword);
        }
        System.out.println("printing backword");
        while (listIterator.hasPrevious()){
            String backword=listIterator.previous();
            System.out.println(backword);
        }
        System.out.println("======================================");

        ListIterator<String> list=shoeBrands.listIterator(2);
        while (list.hasNext()){
            String forwording=list.next();
            System.out.println(forwording);
        }
        System.out.println("==========================================");
        while (list.hasPrevious()){
            String backwording=list.previous();
            System.out.println(backwording);
        }
        System.out.println("after removing");
        while (listIterator.hasNext()){
            String remove=listIterator.next();
            if ("Sparx".equals(remove)){
                listIterator.remove();
            }
        }
        shoeBrands.forEach(l-> System.out.println(l));

        System.out.println("sorting by descending");
        Collections.sort(shoeBrands,(p1,p2)->p2.compareTo(p1));
        shoeBrands.forEach(l-> System.out.println(l));
    }
}
