package src.com.mkpits.java.linkedlist;
// Java program to demonstrate
// iterating over LinkedHashMap.

import java.util.*;
class IteratingOverLinkedHashMap {
    public static void main(String args[])
    {
        // Initialization of a LinkedHashMap
        // using Generics
        LinkedHashMap<Integer, String> hm
                = new LinkedHashMap<Integer, String>();

        // Inserting the Elements
        hm.put(3, "Books");
        hm.put(2, "For");
        hm.put(1, "Pen");

        for (Map.Entry<Integer, String> mapElement : hm.entrySet()) {

            Integer key = mapElement.getKey();

            // Finding the value
            String value = mapElement.getValue();

            // print the key : value pair
            System.out.println(key + " : " + value);
        }
    }
}
