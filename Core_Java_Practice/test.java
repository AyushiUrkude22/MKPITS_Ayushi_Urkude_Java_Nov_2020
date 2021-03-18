//Java program to create a class employee having fields empno and empname.

class EmployeeU
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
		EmployeeU e1 = new employee();
		EmployeeU e2 = new employee();
		e1.empno= 1;
		e1.EmpnameU= "Ayushi";
		System.out.println("First EmployeeU number: " + e1.empno);
		System.out.println("First EmployeeU name: " + e1.empname);
		System.out.println("------------------------------------------");
		e2.empno= 2;
		e2.empname= "Palak";
		System.out.println("Second EmployeeU number: " + e2.empno);
		System.out.println("Second EmployeeU name: " + e2.empname);
	}
}
