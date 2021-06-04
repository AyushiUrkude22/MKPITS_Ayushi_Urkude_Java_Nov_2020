package src.com.mkpits.java.hashtableclass;
// Java program to demonstrate
// adding elements to Hashtable.

import java.io.*;
import java.util.*;

class AddElementsToHashtable2 {
    public static void main(String args[])
    {
        // No need to mention the
        // Generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>();

        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2
                = new Hashtable<Integer, String>();

        // Inserting the Elements
        // using put() method
        ht1.put(1, "Ayushi");
        ht1.put(2, "For");
        ht1.put(3, "Akshya");

        ht2.put(1, "Ayushi");
        ht2.put(2, "For");
        ht2.put(3, "Akshay");

        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
    }
}