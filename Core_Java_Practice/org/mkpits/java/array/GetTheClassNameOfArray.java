package org.mkpits.java.array2;
//Java Program to get the class name of array in Java.

class GetTheClassNameOfArray{
    public static void main(String args[]){
        int arr[]={4,4,5};
        Class c=arr.getClass();
        String name=c.getName();
        System.out.println(name);
    }
}