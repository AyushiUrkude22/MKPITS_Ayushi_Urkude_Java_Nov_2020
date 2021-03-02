//wap to accept 3 subject marks and print total, percentage and grade using if else if...
import java.util.*;
class Hello2
{
	public static void main(String[] arg)//arg is string array to accept command line arguments
	{
				Scanner s1=new Scanner(System.in);
	  int sub1,sub2,sub3,total;
	  float per;
	  		System.out.println("enter 3 subject marks");
	  	sub1=s1.nextInt(); // nextInt is method to accept integer value
	  		sub2=s1.nextInt();
	  		sub3=s1.nextInt();
	  		total=sub1+sub2+sub3;
	  		System.out.println("total = " + total);
	  		per=(float) (total / 300.0f) * 100.0f;
	  		System.out.println("percentage = " + per);
	  		if(per >= 75)
	  		{
				System.out.println("grade : distinction ");
			}
			else if (per >= 60 && per < 75)
			{
				System.out.println("grade : first class");
			}
			else if (per >= 40 && per < 60)
			{
							System.out.println("grade : second class");
			}
			else
			{
				System.out.println("grade : fail");
			}
	  }
}
