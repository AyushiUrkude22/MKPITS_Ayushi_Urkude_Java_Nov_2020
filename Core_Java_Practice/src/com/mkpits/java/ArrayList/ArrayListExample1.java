package src.com.mkpits.java.ArrayList;
//Java Program to example of java array list.

import java.util.*;
public class ArrayListExample1{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
//Printing the arraylist object
        System.out.println(list);
    }
}