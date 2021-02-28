//wap to accept 2 no. and then calculate and display division   of 2 no.
import java.util.*;
class Welcome6
{
	public static void main(String[] arg)
	{
		Scanner s1=new Scanner(System.in);
		int num1,num2,div;
		System.out.println("enter number1");
		num1=s1.nextInt();
		System.out.println("enter number2");
		num2=s1.nextInt();
		div=num1/num2;
		System.out.println("division  = " + div);
	}
}