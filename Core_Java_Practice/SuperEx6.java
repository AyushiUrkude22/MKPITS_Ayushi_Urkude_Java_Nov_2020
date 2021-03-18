//Java program Example of super keyword where super() is provided by the compiler implicitly.
//super is used to invoke parent class constructor.

class AnimalM
{
    AnimalM()
    {
		System.out.println("animal is created");
    }
}

class DogM extends AnimalM
{
    DogM()
    {
		//super(); Implicitly invoked.
    	System.out.println("dogM is created");
    }
}

class SuperEx6
{
    public static void main(String args[])
    {
    	DogM d=new DogM();
    }
}
