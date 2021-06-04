package src.com.mkpits.java.hashmap;
//Java Code to sort Map by key value.

import java.util.*;
class SortMapByKeyValue {

    // This map stores unsorted values
    static Map<String, Integer> map = new HashMap<>();

    // Function to sort map by Key
    public static void SortMapByKeyValue()
    {
        // TreeMap to store values of HashMap
        TreeMap<String, Integer> sorted = new TreeMap<>();

        // Copy all data from hashMap into TreeMap
        sorted.putAll(map);

        // Display the TreeMap which is naturally sorted
        for (Map.Entry<String, Integer> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }

    // Driver Code
    public static void main(String args[])
    {
        // putting values in the Map
        map.put("Anika", 80);
        map.put("Abhishek", 90);
        map.put("Ayushi", 80);
        map.put("Ammi", 75);
        map.put("Pankaj", 40);

        // Calling the function to SortMapByKeyValue
        SortMapByKeyValue();
    }
}