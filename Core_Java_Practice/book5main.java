//Java program to create a class book having fields bookname,author and price
//and a blank constructor and constructor with 3 parameters.

class book1
{
	String bookname;
	String author;
	float price;
	//creating a blank constructor
	  book1()
	{
		bookname="Java Programming";
		author="Ayushi";
		price=235.00f;

	}

	//creating a parameterized constructor
	public  book1(String bn,String au,float pr)
	{
		bookname=bn;
		author=au;
		price=pr;
	}
	//creating a parameterized constructor
	public  book1(String bn,float pr,String au)
	{
		bookname=bn;
		author=au;
		price=pr;
	}
	public void show()
	{
		System.out.println("Bookname = " + bookname);
		System.out.println("Author = " + author   );
		System.out.println("Price = " + price);
	}
}
class book5main
{
	public static void main(String[] args)
	{
		book b=new book(); // automatically it will call constructor without parameters
		System.out.println("\n");
		System.out.println("Book 1 details");
		b.show();
		book b1=new book("Oracle","Akshay",400.0f);//constructor with 3 parameters
		System.out.println("\n");
		System.out.println("Book 2 details");
		b1.show();
		book b2=new book("Python",500.0f,"nisha");//constructor with 3 parameters
		System.out.println("\n");
		System.out.println("Book 3 details");
		b2.show();
	}
}