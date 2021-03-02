//wap to accept length and breadth of a rectangle and calculate and display area of a rectangle.
import java.util.*;
  class Welcome8
{
	public static void main(String[] arg)
	{
		Scanner s1=new Scanner(System.in);
		int length,breadth,area;
		System.out.println("enter length");
		length=s1.nextInt();
		System.out.println("enter breadth");
		breadth=s1.nextInt();
		area=length * breadth;
		System.out.println("area of a rectangle  = " + area);
	}
}
