//wap to accept 2 no. and then calculate and display multiplication  of 2 no.
import java.util.*;
class Welcome5
{
	public static void main(String[] arg)
	{
		Scanner s1=new Scanner(System.in);
		int num1,num2,mul;
		System.out.println("enter number1");
		num1=s1.nextInt();
		System.out.println("enter number2");
		num2=s1.nextInt();
		mul=num1*num2;
		System.out.println("multiplication = " + mul);
	}
}