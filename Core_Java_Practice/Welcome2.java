//wap to accept a number from the user and print square of the number.
import java.util.*;
class Welcome2
{
	public static void main(String[] arg)
	{
		Scanner s1= new Scanner(System.in);//scanner is a class, s1 is object
		int num,square;
		System.out.println("enter number");
		num=s1.nextInt(); // nextInt is method to accept integer value
		square=num*num;
		System.out.println("square of number = " + square);
	}
}
