//Java program Example of dynamic binding
//When type of the object is determined at run-time,
//it is known as dynamic binding.

class AnimalDogs
{
    void eat()
    {
		System.out.println("animal is eating...");
	}
}

class DogDynamicBindingP2 extends AnimalDogs
{
    void eat()
    {
		System.out.println("dog is eating...");
	}
    public static void main(String args[])
    {
		Animal a=new DogDynamicBindingP2();
        a.eat();
    }
}
