package src.com.mkpits.java.arrayList;
//Java ArrayList example of isEmpty() method.

import java.util.*;
class ArrayList6{

    public static void main(String [] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        System.out.println("Is ArrayList Empty: "+al.isEmpty());
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        System.out.println("After Insertion");
        System.out.println("Is ArrayList Empty: "+al.isEmpty());
    }
}
