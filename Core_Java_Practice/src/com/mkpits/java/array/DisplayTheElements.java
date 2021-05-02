package org.mkpits.java.array;
// Write a program display the elements of an array using for loop.

class DisplayTheElements {
    public static void main(String[] arg)
    {
        int[] num= new int[5];
        num[0]=11;
        num[1]=22;
        num[2]=33;
        num[3]=44;
        num[4]=55;
        for(int i=0; i<5 ; i++)
        {
            System.out.println(num[i]);
        }
    }
}
