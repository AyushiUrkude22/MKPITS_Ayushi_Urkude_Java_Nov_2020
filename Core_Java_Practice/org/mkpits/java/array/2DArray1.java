package org.mkpits.java.array;

import java.util.Scanner;
class ArrayDimension
{
	public static void main(String[] args)
	{
		int[][] arr = new int[3][3];
		int i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the elements in the 2D array: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j]= s.nextInt();
			}
		}
		System.out.println("Display the elements in the 2D array: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}