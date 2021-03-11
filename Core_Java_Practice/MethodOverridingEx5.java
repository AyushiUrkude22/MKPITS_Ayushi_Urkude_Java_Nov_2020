//Java Program to demonstrate the real scenario of Java Method Overriding
//where three classes are overriding the method of a parent class.(Example: Bank class)
class BankN
{
	static int roi=2;
    int getRateOfInterest()
    {
		return 0;
    }
    static void showroi()
    {
		System.out.println("roi from static method : " + roi);
	}
}

//Creating child classes.
class SBIBank extends BankN
{
	int getRateOfInterest()
	{
		roi=roi+5;
		return roi;
	}
}

class ICICIBank extends BankN
{
    int getRateOfInterest()
    {
		return 11;
    }
}

class AXISBank extends BankN
{
    int getRateOfInterest()
    {
		return 12;
    }
}

//Test class to create objects and call the methods
class MethodOverridingEx5
{
    public static void main(String args[])
    {
    	SBI s=new SBI();
    	Bank.showroi();
    	ICICI i=new ICICI();
    	AXIS a=new AXIS();
    	System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
   		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
   		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}