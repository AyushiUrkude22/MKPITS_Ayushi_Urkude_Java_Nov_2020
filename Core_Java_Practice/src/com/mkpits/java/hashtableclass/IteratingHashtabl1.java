package src.com.mkpits.java.hashtableclass;
// Java program to illustrate
// traversal of Hashtable.

import java.util.Hashtable;
import java.util.Map;

class IteratingHashtable1 {
    public static void main(String[] args)
    {
        // Create an instance of Hashtable
        Hashtable<String, Integer> ht = new Hashtable<>();

        // Adding elements using put method
        ht.put("vishali", 10);
        ht.put("sakshi", 30);
        ht.put("khush", 20);

        // Iterating using enhanced for loop
        for (Map.Entry<String, Integer> e : ht.entrySet())
            System.out.println(e.getKey() + " "
                    + e.getValue());
    }
}