package src.com.mkpits.java.collection;
// A Java program to demonstrate
// working of SortedSet.

import java.util.*;

class SortedSet {
    public static void main(String[] args)
    {
        // Create a TreeSet and inserting elements
        SortedMap<Integer, String> mp = new TreeMap<>();

        // Adding Element to SortedSet
        mp.put(1, "One");
        mp.put(2, "Two");
        mp.put(3, "Three");
        mp.put(4, "Four");
        mp.put(5, "Five");

        // Returning the key greater
        // than or equal to 2
        System.out.print("Last Key in the map is : "
                + mp.tailMap(2));
    }
}
