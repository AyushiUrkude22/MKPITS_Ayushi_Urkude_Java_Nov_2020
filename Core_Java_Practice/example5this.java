//Java program to invoke current class method using this keyword.

class A1
{
    void m()
    {
		System.out.println("hello m");
	}
    void n()
	{
    	System.out.println("hello n");
    	//m();//same as this.m()
    	this.m();
    }
}

class example5this
{
    public static void main(String[] args)
    {
    	A a=new A();
    	a.n();
    }
}