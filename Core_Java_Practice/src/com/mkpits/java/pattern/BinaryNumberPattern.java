package org.mkpits.java.pattern;
/* Write a program to Binary Number Pattern
Enter the number of rows: 5
10101
01010
10101
01010
10101 */

import java.util.Scanner;
public class BinaryNumberPattern
    {
        public static void main(String[] args)

        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of rows: ");

            int rows = sc.nextInt();

            for (int i = 1; i <= rows; i++)
            {
                int num;

                if(i%2 == 0)
                {
                    num = 0;

                    for (int j = 1; j <= rows; j++)
                    {
                        System.out.print(num);

                        num = (num == 0)? 1 : 0;
                    }
                }
                else
                {
                    num = 1;

                    for (int j = 1; j <= rows; j++)
                    {
                        System.out.print(num);

                        num = (num == 0)? 1 : 0;
                    }
                }

                System.out.println();

            }

            sc.close();
        }
    }
