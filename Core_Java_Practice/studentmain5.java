//Java program to create a class student having fields rno and name

class StudentC
{
	int rno;
	String name;
}

class studentmain5
{
	public static void main(String[] args)
	{
		student s1 = new student();
		s1.rno=22;
		s1.name="Ayushi";
		System.out.println("Roll number of first student: "+ s1.rno);
		System.out.println("Name of first student: "+ s1.name);
		System.out.println("-----------------------------------------------");
		student s2 = new student();
		s2.rno=24;
		s2.name="Akshay";
		System.out.println("Roll number of second student: "+ s2.rno);
		System.out.println("Name of second student: "+ s2.name);
	}
}
