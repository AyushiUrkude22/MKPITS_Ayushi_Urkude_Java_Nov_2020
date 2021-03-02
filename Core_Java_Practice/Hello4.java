//
import java.util.*;
class Hello4
{
	public static void main(String[] arg)
	{
				Scanner s1=new Scanner(System.in);
				int n1,n2,res=0;
				char op;
				System.out.println("enter 2 no.");
				n1=s1.nextInt();
				n2=s1.nextInt();
				System.out.println("enter operator +,- *");
				op=s1.next().charAt(0);

				switch(op)
				{
					case '+':
					res=n1+n2;
					break;
					case '-':
										res=n1-n2;
					break;
					case '*':
										res=n1*n2;
					break;
					case '/':
															res=n1/n2;
					break;

					default:
					System.out.println("invalid operator entered");
					break;


				}
				System.out.println("res = " + res);
	}
}























