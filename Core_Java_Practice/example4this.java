//Java program to call parameterized constructor from default constructor using this keyword.

class Abc
{
	int x;
    Abc()
    {
		this(10);
		x=20;
		System.out.println("hello default constructor x = " + x); //20
	}
    Abc(int x)
    {
		System.out.println("Hello parameterized constructor x= " + x); //10
    }
}

class example4this
{
    public static void main(String[] args)
    {
    	A a=new A();
    }
}
