//Java program example for Method Overloading: changing no. of arguments.

class Adder
{
    static int add(int a,int b)
    {
		return a+b;
	}
    static int add(int a,int b,int c)
    {
		return a+b+c;
	}
}

class OverloadingEx1
{
	public static void main(String[] args)
	{
    	System.out.println("Addition of two numbers 22 and 22 is " + Adder.add(22,22));
    	System.out.println("Addition of three numbers 22, 22 and 22 is " + Adder.add(22,22,22));
    }
}