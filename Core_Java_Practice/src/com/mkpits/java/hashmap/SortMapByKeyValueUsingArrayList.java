package src.com.mkpits.java.hashmap;
//Java Code to sort Map by key value Using ArrayList .

import java.util.*;
class SortMapByKeyValueUsingArrayList {

    // This map stores unsorted values
    static Map<String, Integer> map = new HashMap<>();

    // Function to sort map by Key
    public static void SortMapByKeyValueUsingArrayList()
    {
        ArrayList<String> sortedKeys
                = new ArrayList<String>(map.keySet());

        Collections.sort(sortedKeys);

        // Display the TreeMap which is naturally sorted
        for (String x : sortedKeys)
            System.out.println("Key = " + x
                    + ", Value = " + map.get(x));
    }

    // Driver Code
    public static void main(String args[])
    {
        // putting values in the Map
        map.put("Ayushi", 80);
        map.put("Abhi", 90);
        map.put("Bali", 80);
        map.put("Monty", 75);
        map.put("Sooby", 40);

        // Calling the function to SortMapByKeyValueUsingArrayList
        SortMapByKeyValueUsingArrayList();
    }
}