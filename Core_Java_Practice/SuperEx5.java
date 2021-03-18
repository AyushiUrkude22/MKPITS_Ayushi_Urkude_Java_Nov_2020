//Java program example for implementing super keyword for invoking parent class constructor (explicitly)
//super is used to invoke parent class constructor.

class AnimalV
{
    AnimalV()
    {
		System.out.println("animal is created");
    }
}

class DogV extends AnimalV
{
    DogV()
    {
    	super();
    	System.out.println("dog is created");
    }
}

class SuperEx5
{
    public static void main(String args[])
    {
    	DogV d=new DogV();
    }
}
