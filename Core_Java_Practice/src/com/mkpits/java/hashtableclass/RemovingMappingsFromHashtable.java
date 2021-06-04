package src.com.mkpits.java.hashtableclass;
// Java program to demonstrate
// the removing mappings from Hashtable.

import java.io.*;
import java.util.*;
class RemovingMappingsFromHashtable {

    public static void main(String args[])
    {
        // Initialization of a Hashtable
        Map<Integer, String> ht
                = new Hashtable<Integer, String>();

        // Inserting the Elements
        // using put method
        ht.put(1, "Books");
        ht.put(2, "For");
        ht.put(3, "Books");
        ht.put(4, "For");

        // Initial HashMap
        System.out.println("Initial map : " + ht);

        // Remove the map entry with key 4
        ht.remove(4);

        // Final Hashtable
        System.out.println("Updated map : " + ht);
    }
}
