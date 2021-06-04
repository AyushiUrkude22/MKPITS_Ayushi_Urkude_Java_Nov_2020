package src.com.mkpits.java.treemap;
// Java Code to sort Map by key value Using TreeMap.

import java.util.*;
class SortMapByKeyValueUsingTreeMap {

    // This map stores unsorted values
    static Map<String, Integer> map = new HashMap<>();

    // Function to sort map by Key
    public static void SortMapByKeyValueUsingTreeMap()
    {
        // TreeMap to store values of HashMap
        TreeMap<String, Integer> sorted
                = new TreeMap<>(map);

        // Display the TreeMap which is naturally sorted
        for (Map.Entry<String, Integer> entry :
                sorted.entrySet())
            System.out.println("Key = " + entry.getKey()
                    + ", Value = "
                    + entry.getValue());
    }

    // Driver Code
    public static void main(String args[])
    {
        // putting values in the Map
        map.put("Janvi", 80);
        map.put("Pooja", 90);
        map.put("Mohit", 80);
        map.put("Ayushi", 75);
        map.put("Om", 40);

        // Calling the function to SortMapByKeyValueUsingTreeMap
        SortMapByKeyValueUsingTreeMap();
    }
}