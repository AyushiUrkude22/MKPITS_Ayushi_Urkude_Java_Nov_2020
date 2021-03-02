//accept the values from the user  in the above example
import java.util.*;
class employee
{
int empno;
String empname;
String designation;
float salary;
void getdata(int a,String b, String c,float d)
{
	empno=a;
	empname=b;
	designation=c;
	salary=d;
}
void showdata()
{
	System.out.println("------------------------------------- ");
		System.out.println("-----------Employee Details--------- ");
System.out.println("empno = " + empno);
System.out.println("empname = " + empname);
System.out.println("designation = " + designation);
System.out.println("salary = " + salary);
System.out.println("------------------------------------- ");
}
}

//creating a class Mkpits4
class Mkpits4
{
	public static void main(String[] arg)
	{

		Scanner s1=new Scanner(System.in);
		employee emp=new employee();
		System.out.println("enter employee no");
		int en=s1.nextInt();
		System.out.println("enter emp name ");
		String ename=s1.next();
		System.out.println("enter emp deisgnation ");
		String ed=s1.next();
		System.out.println("enter emp salary ");
		float sa=s1.nextFloat();
		emp.getdata(en,ename,ed,sa);
		emp.showdata();

employee emp1=new employee();
		System.out.println("enter employee no");
		en=s1.nextInt();
		System.out.println("enter emp name ");
		 ename=s1.next();
		System.out.println("enter emp deisgnation ");
		 ed=s1.next();
		System.out.println("enter emp salary ");
		 sa=s1.nextFloat();
		emp1.getdata(en,ename,ed,sa);
		emp1.showdata();


	}
}
