package src.com.mkpits.java.linkedlist;
//Java LinkedHashSet example ignoring duplicate Elements.

import java.util.*;
class LinkedHashSet2{
    public static void main(String args[]){
        LinkedHashSet<String> al=new LinkedHashSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
    }
}