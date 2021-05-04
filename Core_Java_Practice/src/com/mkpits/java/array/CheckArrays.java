package src.com.mkpits.java.array;
//Java Program to example shows how to use equals () method of Arrays to check if two arrays are equal or not.

import java.util.Arrays;
public class CheckArrays {
    public static void main(String[] args) throws Exception {
        int[] ary = {1,2,3,4,5,6};
        int[] ary1 = {1,2,3,4,5,6};
        int[] ary2 = {1,2,3,4};
        System.out.println("Is array 1 equal to array 2?? " +Arrays.equals(ary, ary1));
        System.out.println("Is array 1 equal to array 3?? " +Arrays.equals(ary, ary2));
    }
}