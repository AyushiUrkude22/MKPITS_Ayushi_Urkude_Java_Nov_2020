class sample
{
	int j=1;
	static int i=1;
	public static void show1()
	{
		i=i+1;
		System.out.println("hello from show1 i= " + i);
	}
	public  void show()
		{
				j=j+1;
			System.out.println("hello from show j= " + j);
	}
}
class stest
{
	public static void display()
	{

		System.out.println("hello from display j ");
	}
	public static void main(String[] arg)
	{

		display();
		sample s=new sample();
		s.show();
		s.show1();
		sample s1=new sample();
		s1.show();
		s1.show1();

	}
}