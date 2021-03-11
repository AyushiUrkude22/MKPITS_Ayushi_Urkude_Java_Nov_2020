//Java program example for java instanceof operator.
//An object of subclass type is also a type of parent class.
//For example, if Dog extends Animal then object of Dog can be
//referred by either Dog or Animal class.

class AnimalCat{}

class DoginstanceofA extends Animal
{
	//DoginstanceofA inherits Animal
	public static void main(String args[])
	{
    	DoginstanceofA d=new DoginstanceofA();
    	System.out.println(d instanceof Animal);//true
    }
}