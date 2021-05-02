package org.mkpits.java.pattern;
/*Write a program to Mirrored Right Triangle Star Program.
     *
    **
   ***
  ****
 *****
******
*/

import java.util.Scanner;
class MirroredRightTriangleStarProgram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i= 0; i<= rows; i++)
        {
            for (int j=1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}