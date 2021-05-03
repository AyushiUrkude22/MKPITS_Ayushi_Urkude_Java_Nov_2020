package src.com.mkpits.java.array;
//Java Program to reverse an array list.

import java.util.ArrayList;
import java.util.Collections;
public class ReverseAnArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("Before Reverse Order: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("After Reverse Order: " + arrayList);
    }
}