package org.mkpits.java.pattern;
/*Write a program to Pyramid Program.
    *
   * *
  * * *
 * * * *
* * * * *
*/
import java.util.Scanner;
class PyramidPattern {
    public static void pyramidPattern(int n)
    {
        for (int i=0; i<n; i++)
        {
			for (int j=n-i; j>1; j--)
            {
                System.out.print(" ");
			}
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
        int n = scan.nextInt();
        pyramidPattern(n);
    }
}