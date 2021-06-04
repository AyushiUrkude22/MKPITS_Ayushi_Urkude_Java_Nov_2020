package src.com.mkpits.java.linkedlist;
// Java program to demonstrate
// changing/updating of LinkedHashMap

import java.util.*;

class UpdatingLinkedHashMap {

    public static void main(String args[])
    {
        // Initialization of a LinkedHashMap
        // using Generics
        LinkedHashMap<Integer, String> hm
                = new LinkedHashMap<Integer, String>();

        // Insert mappings using put() method
        hm.put(3, "Ayushi");
        hm.put(2, "Ayushi");
        hm.put(1, "Ayushi");

        // print mappings to the console
        System.out.println("Initial map : " + hm);

        // Update the value with key 2
        hm.put(2, "For");

        // print the updated map
        System.out.println("Updated Map : " + hm);
    }
}