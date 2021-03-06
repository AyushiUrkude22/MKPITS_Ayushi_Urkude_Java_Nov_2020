//Java program to demonstrate real usage of this() constructor call

class Student
{
    int rollno;
    String name,course;
    float fee;
    Student(int rollno,String name,String course)
	{
    	this.rollno=rollno;
    	this.name=name;
    	this.course=course;
    }
    Student(int rollno,String name,String course,float fee)
	{
    	this(rollno,name,course);//reusing constructor
    	this.fee=fee;
    }
    void display()
    {
		System.out.println(rollno+" "+name+" "+course+" "+fee);
	}
}

class example6this
{
    public static void main(String args[])
    {
    	Student s1=new Student(111,"soumya","java");
    	Student s2=new Student(112,"pankaj","java",6000f);
    	s1.display();
    	s2.display();
    }
}
