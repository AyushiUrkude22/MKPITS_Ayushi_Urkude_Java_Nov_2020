//Java program to demonstrate upcasting.

class BikeA
{
	void run()
	{
		System.out.println("running");
	}
}

class SplendorUpcastingEx1 extends BikeA
{
	void run()
	{
		System.out.println("running safely with 80km");
	}
    public static void main(String args[])
    {
        Bike b = new SplendorUpcastingEx1();//upcasting
        b.run();
    }
}