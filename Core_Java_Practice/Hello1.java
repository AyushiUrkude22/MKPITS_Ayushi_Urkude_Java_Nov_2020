//wap to accept 2 no and print greater no.
import java.util.*;
class Hello1
{
	public static void main(String[] arg)//arg is string array to accept command line arguments
	{
				Scanner s1=new Scanner(System.in);
	  int n1,n2;
	  		System.out.println("enter number1 and number 2");
	  		n1=s1.nextInt(); // nextInt is method to accept integer value
	  		n2=s1.nextInt();
	  		if(n1 > n2)
	  		{
				System.out.println("n1 is greater than n2");
			}
			else
			{
				System.out.println("n2 is greater than n1");
			}
	  }
}
