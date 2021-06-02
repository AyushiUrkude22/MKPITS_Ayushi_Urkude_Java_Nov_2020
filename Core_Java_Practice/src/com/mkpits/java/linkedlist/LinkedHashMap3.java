package src.com.mkpits.java.linkedlist;
//Java LinkedHashMap Example:remove().

import java.util.*;
public class LinkedHashMap3 {
    public static void main(String args[]) {
        Map<Integer,String> map=new LinkedHashMap<Integer,String>();
        map.put(101,"Ammi");
        map.put(102,"Ubba");
        map.put(103,"Sigared");
        System.out.println("Before invoking remove() method: "+map);
        map.remove(102);
        System.out.println("After invoking remove() method: "+map);

    }
}
