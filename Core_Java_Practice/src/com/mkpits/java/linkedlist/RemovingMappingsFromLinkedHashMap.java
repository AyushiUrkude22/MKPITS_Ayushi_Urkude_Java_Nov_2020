package src.com.mkpits.java.linkedlist;
// Java program to demonstrate the
// removing of elements from LinkedHashMap.

import java.util.*;

class RemovingMappingsFromLinkedHashMap {
    public static void main(String args[])
    {
        // Initialization of a LinkedHashMap
        // using Generics
        LinkedHashMap<Integer, String> hm
                = new LinkedHashMap<Integer, String>();

        // Inserting the Elements
        // using put() method
        hm.put(3, "Ayushi");
        hm.put(2, "Ayushi");
        hm.put(1, "Ayushi");
        hm.put(4, "For");

        // print the mappings to the console
        System.out.println("Initial Map : " + hm);

        // Remove the mapping with Key 4
        hm.remove(4);

        // print the updated map
        System.out.println("Updated Map : " + hm);
    }
}