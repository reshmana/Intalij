package com.xworkz.listIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AddShoesBrands {
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
        System.out.println("After adding");
        while (listIterator.hasNext()){
            String forword=listIterator.next();
            if ("Puma".equals(forword)){
               listIterator.add("nyke");
            }
        }

        shoeBrands.forEach(l-> System.out.println(l));

    }
}
