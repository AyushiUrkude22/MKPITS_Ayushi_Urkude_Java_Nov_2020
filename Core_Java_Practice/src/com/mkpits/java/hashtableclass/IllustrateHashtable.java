package src.com.mkpits.java.hashtableclass;
// Java program to illustrate
// Java.util.Hashtable.

import java.util.*;

public class IllustrateHashtable {
    public static void main(String[] args)
    {
        // Create an empty Hashtable
        Hashtable<String, Integer> ht = new Hashtable<>();

        // Add elements to the hashtable
        ht.put("Palak", 10);
        ht.put("Soumya", 30);
        ht.put("Kalash", 20);

        // Print size and content
        System.out.println("Size of map is:- " + ht.size());
        System.out.println(ht);

        // Check if a key is present and if
        // present, print value
        if (ht.containsKey("Palak")) {
            Integer a = ht.get("Palak");
            System.out.println("value for key" + " \"Palak\" is:- " + a);
        }
    }
}