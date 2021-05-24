package src.com.mkpits.java.ArrayList;
//Java example to traverse the ArrayList elements using the for-each loop.

import java.util.*;
public class TraverseArrayListElementsUsingForEachLoop{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
//Traversing list through for-each loop
        for(String fruit:list)
            System.out.println(fruit);

    }
}