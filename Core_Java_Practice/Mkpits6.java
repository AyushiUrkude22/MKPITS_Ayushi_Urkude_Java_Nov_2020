//create a class employee with blank and parameterized constructor
import java.util.*;
class employeep
{
int empno;
String empname;
String designation;
float salary;
//creating a constructor with no parameters
 public void employee()
{
	empno=02;
	empname="Akshay";
	designation="detective";
	salary=5655f;
}
//creating a parameterized constructor
public void employee(int en, String ena, String des, float sal)
{
	empno=en;
	empname=ena;
	designation=des;
	salary=sal;
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

//creating a class Mkpits6
class Mkpits6
{
	public static void main(String[] arg)
	{

		Scanner s1=new Scanner(System.in);
		employee emp=new employee(); // it will call blank constructor automatically
		emp.showdata();

		System.out.println("enter employee no");
		int en=s1.nextInt();
		System.out.println("enter emp name ");
		String ename=s1.next();
		System.out.println("enter emp deisgnation ");
		String ed=s1.next();
		System.out.println("enter emp salary ");
		float sa=s1.nextFloat();
		//creating another object
		employee emp1=new employee(en,ename,ed,sa); //call constructor with parameters
		emp1.showdata();
}
}
