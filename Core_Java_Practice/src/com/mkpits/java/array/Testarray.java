package org.mkpits.java.array;
// Java program to create Test array.

class Testarray
{
    public static void main(String args[]){
        int arr[]={50,60,70,80};
        for(int i=0;i<=arr.length;i++){

            try
            {
                System.out.println(arr[i]);
            }
            catch(ArrayIndexOutOfBoundsException ee)
            {
                System.out.println(ee);
            }
        }
        System.out.println("bye");

    }
}