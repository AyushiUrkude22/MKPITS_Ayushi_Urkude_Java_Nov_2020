package src.com.mkpits.java.linkedlist;
//Java LinkedHashMap Example.

import java.util.*;
class LinkedHashMap1{
    public static void main(String args[]){

        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();

        hm.put(100,"Ayushi");
        hm.put(101,"Akshay");
        hm.put(102,"Rutaj");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
