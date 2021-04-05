package org.mkpits.java.array2;
//Java program to create an array of integers, put some values in the array, and print each value to standard output.

class ArrayOfIntegers1 {
	public static void main(String[] args)
	{
		int[] arrayInt= {28,24,66,57,21};
		System.out.println("Printing the elements of the given array: ");
		for(int i=0;i<5;i++)
		{
			System.out.println(arrayInt[i]);
		}
	}
}