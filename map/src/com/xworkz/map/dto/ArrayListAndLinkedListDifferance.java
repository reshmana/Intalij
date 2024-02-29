package com.xworkz.map.dto;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedListDifferance {

    public static void main(String[] args) {

        Object[] elements= new ArrayList[10];

        ArrayList list=new ArrayList();
        //represent by System.arraycopy("com.");.[].
        list.add(elements);//--->Load Factor
        list.add(elements);//--->Load Factor
        list.add(elements);//--->Load Factor
        list.add(elements);//--->Load Factor
        list.add(elements);//--->Load Factor
        list.add(elements);//--->Load Factor
        list.add(elements);//--->Load Factor---->elements=new Object[15]
        list.add(elements);//--->Load Factor create new Array with a bigger size :new object[15]
                            // ---->System.arraycopy("com.");

        LinkedList list1=new LinkedList<>();
        //represent by node
        list1.add("prev");//(prev,25,next)//
        list1.add(20);//(2nd,25,3rd)
        list1.add("next");//(3rd,25,next)//douly linked




    }
}
