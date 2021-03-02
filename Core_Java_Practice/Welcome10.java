//wap to accept radius of a circle and calculate and print area of circle(area= 3.14 * r * r)
import java.util.*;
class Welcome10
{
	public static void main(String[] arg)
	{
		Scanner s1=new Scanner(System.in);
	  int radius;
	  		float area,circ;
	  		System.out.println("enter radius of a circle");
	  		radius=s1.nextInt();

	  		area=3.14f * radius * radius;
	  		System.out.println("area of a circle  = " + area);
	  		circ=2 * 3.14f * radius ;
	  		System.out.println("circ of a circle  = " + circ);
	}
}
