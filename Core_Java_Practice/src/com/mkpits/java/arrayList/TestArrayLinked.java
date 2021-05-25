package src.com.mkpits.java.arrayList;
//Java example where we are using ArrayList and LinkedList both.

import java.util.*;
class TestArrayLinked{
    public static void main(String args[]){

        List<String> al=new ArrayList<String>();//creating arraylist
        al.add("Ammi");//adding object in arraylist
        al.add("Clay");
        al.add("Ubba");
        al.add("Ivar");

        List<String> al2=new LinkedList<String>();//creating linkedlist
        al2.add("Judit");//adding object in linkedlist
        al2.add("Bion");
        al2.add("Helga");
        al2.add("Floki");

        System.out.println("arraylist: "+al);
        System.out.println("linkedlist: "+al2);

    }
}
