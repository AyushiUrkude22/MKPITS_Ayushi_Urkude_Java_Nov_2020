//Java program example for implementing super keyword for invoking parent class constructor.(Explicitly)
//super is used to invoke parent class constructor.

class AnimalX
{
    AnimalX()
    {
		System.out.println("eating...");
    }
}

class DogX extends AnimalX
{
    DogX()
    {
		super();
		System.out.println("eating bread...");
    }
    void bark()
    {
		System.out.println("barking...");
    }
}

class SuperEx4
{
    public static void main(String args[])
    {
    	DogX d=new DogX();
    	d.bark();
    }
}