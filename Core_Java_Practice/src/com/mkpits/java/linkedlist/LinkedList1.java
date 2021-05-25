package src.com.mkpits.java.linkedlist;
//Java LinkedList Example.

import java.util.*;
public class LinkedList1 {
    public static void main(String args[]) {

        LinkedList<String> al = new LinkedList<String>();
        al.add("Rakhi");
        al.add("Ayushi");
        al.add("Ravi");
        al.add("Om");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
