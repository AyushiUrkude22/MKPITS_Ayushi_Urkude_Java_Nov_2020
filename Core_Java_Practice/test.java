//Java program to create a class employee having fields empno and empname.

class employee
{
	int empno;
	String empname;

    public void getdata(String manager, int i1) {
    }
}

class test
{
	public static void main(String[] args)
	{
		employee e1 = new employee();
		employee e2 = new employee();
		e1.empno= 1;
		e1.empname= "Ayushi";
		System.out.println("First Employee number: " + e1.empno);
		System.out.println("First Employee name: " + e1.empname);
		System.out.println("------------------------------------------");
		e2.empno= 2;
		e2.empname= "Palak";
		System.out.println("Second Employee number: " + e2.empno);
		System.out.println("Second Employee name: " + e2.empname);
	}
}
