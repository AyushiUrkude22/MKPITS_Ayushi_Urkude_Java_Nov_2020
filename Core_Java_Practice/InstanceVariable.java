//Java program example of using this keyword to refer current class book's instance variable
//bookname
class BooksInstanceVariable
{
	//creating instance variable
	String bookname;
	//creating a constructor with parameters
	public BooksInstanceVariable   (String bookname)
	{
		this.bookname=bookname;
	}
	//creating a method display
	public void display()
	{
		System.out.println("Bookname: " + bookname);
	}
}
//creating a class
class InstanceVariable
{
	public static void main(String[] args)
	{
		book b1=new book("java");
		b1.display();
	}
}