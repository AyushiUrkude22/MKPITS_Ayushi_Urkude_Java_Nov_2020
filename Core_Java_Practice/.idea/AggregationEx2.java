class Address
{
	String city;
	String state;
	int pincode;
}
//creating a class Employee
class Employee
{
	int empno;
	String empname;
	Address address;	//object address of class Address.
	void getdata(int empno,String empname, Address address)
	{
		this.empno=empno;
		this.empname=empname;
		this.address=address;
	}
	void showdata()
	{
		System.out.println("Employee Number: " + empno);
		System.out.println("Employee Name: " + empname);
		System.out.println("Employee City: " + address.city);
		System.out.println("Employee State " + address.state);
		System.out.println("Employee Pincode " + address.pincode);
	}

}

class AggregationEx2
{
	public static void main(String[] args)
	{
		Employee emp = new Employee();
		Address adr = new Address();
		adr.city="Nagpur";
		adr.state="Maharashtra";
		adr.pincode=440007;
		emp.getdata(22,"Ayushi Urkude",adr);
		emp.showdata();
	}
}