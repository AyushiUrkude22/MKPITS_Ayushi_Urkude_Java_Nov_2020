//Java program to call default constructor from parameterized constructor using this keyword.
class Ab
{
	//int x;
    Ab()
    {
		System.out.println("Hello default constructor ");
	}
    Ab(int x)
    {
    	this();
    	System.out.println("Hello parameterized constructor x= " + x);  //10
    	//System.out.println("x= " + this.x); This statement prints the value of x= 0 i.e default
    	//value of instance variable.
    }
}

class DefaultConstructorFromParameterizedonstructor2
{
	public static void main(String[] args)
    {
    	A a=new A(10);
    }
}