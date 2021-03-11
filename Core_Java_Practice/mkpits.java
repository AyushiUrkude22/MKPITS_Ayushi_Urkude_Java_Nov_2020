/* Example  a class employee having attributes empno,empname , designation and salary

and methods getdata and showdata */

//creating a class mkpits
class DisplayEmployeeInfo
{
	public static void main(String[] arg)
	{
		employee emp=new employee();
		emp.getdata(111, "manager",50000);
		emp.showdata();

	}
}
