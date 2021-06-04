package src.com.mkpits.java.linkedlist;
// Java program to demonstrate adding
// elements to a LinkedHashMap.

import java.util.*;

class AddElementsToLinkedHashMap1 {

    public static void main(String args[])
    {

        // Initialization of a LinkedHashMap
        // using Generics
        LinkedHashMap<Integer, String> hm1
                = new LinkedHashMap<Integer, String>();

        // Add mappings using
        // put() method
        hm1.put(3, "Pen");
        hm1.put(2, "For");
        hm1.put(1, "Book");

        // print mappings to the console
        System.out.println("Mappings of LinkedHashMap : "
                + hm1);
    }
}