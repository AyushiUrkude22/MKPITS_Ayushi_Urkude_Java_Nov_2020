package src.com.mkpits.java.array;
//Java Program to example of  Arrays Remove.

import java.util.ArrayList;
public class ArraysRemove {
    public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<Integer>(5);
            arr.add(20);
            arr.add(15);
            arr.add(30);
            arr.add(45);

            System.out.println("Size of list: " + arr.size());
            for (Integer number : arr) {
                System.out.println("Number = " + number);
            }
            arr.remove(2);
            System.out.println("Now, Size of list: " + arr.size());

            for (Integer number : arr) {
                System.out.println("Number = " + number);
            }
        }
    }