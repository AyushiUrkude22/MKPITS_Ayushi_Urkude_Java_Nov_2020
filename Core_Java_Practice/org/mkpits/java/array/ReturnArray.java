package org.mkpits.java.array2;
//Java Program to return an array from the method.

class ReturnArray{

  static int[] get(){
  return new int[]{10,40,80,20,70};
}
  public static void main(String args[]){
      int arr[]=get();
      for(int i=0;i<arr.length;i++)
     System.out.println(arr[i]);

    }
}