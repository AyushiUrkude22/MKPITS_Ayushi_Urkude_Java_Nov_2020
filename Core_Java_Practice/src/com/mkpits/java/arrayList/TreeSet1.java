package src.com.mkpits.java.arrayList;
//Java example of Java TreeSet.

import java.util.*;
class TreeSet1{
    public static void main(String args[]){
//Creating and adding elements
        TreeSet<String> al=new TreeSet<String>();
        al.add("Rakhi");
        al.add("Ayushi");
        al.add("Rakhi");
        al.add("Anku");
//Traversing elements
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
