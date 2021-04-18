package org.mkpits.java.pattern;
/*Write a program to Descending order Pattern
Enter the number of rows: 5
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1 */

import java.util.Scanner;
public class DescendingOrderPattern
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

//Taking rows value from the user

            System.out.println("Enter the number of rows: ");

            int rows = sc.nextInt();
            for (int i = rows; i >= 1; i--)
            {
                for (int j = rows; j >= i; j--)
                {
                    System.out.print(j+" ");
                }

                System.out.println();
            }
            sc.close();
        }
    }
