//Java program example for implementing super keyword.
//super is used to refer immediate parent class instance variable.

class AnimalK
{
	String color="white";
}

class DogK extends AnimalK
{
	String color="black";
	void printColor()
	{
		System.out.println(super.color);//prints color of Animal class
	}
}

class BabyDogK extends DogK
{
	String color="brown";
	void printColor1()
	{
		System.out.println(color);//prints color of BabyDog class
		System.out.println(super.color);//prints color of Dog class
		printColor();
	}
}

class ImplementingSuperKeyword
{
	public static void main(String args[])
	{
	    BabyDog d=new BabyDogK();
	    d.printColor1();
    }
}