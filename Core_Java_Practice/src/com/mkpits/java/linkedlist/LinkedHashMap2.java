package src.com.mkpits.java.linkedlist;
//Java LinkedHashMap Example: Key-Value pair.

import java.util.*;
class LinkedHashMap2{
    public static void main(String args[]){
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(100,"Anshika");
        map.put(101,"Abha");
        map.put(102,"Rakhi");
//Fetching key
        System.out.println("Keys: "+map.keySet());
//Fetching value
        System.out.println("Values: "+map.values());
//Fetching key-value pair
        System.out.println("Key-Value pairs: "+map.entrySet());
    }
}
