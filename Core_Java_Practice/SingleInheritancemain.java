//Simple Java program example for Single Inheritance.

class Animal10
{
    void eat()
    {
		System.out.println("eating...");
	}
}

class Dogb extends Animal10
{
    void bark()
    {
		System.out.println("barking...");
	}
}

class SingleInheritancemain
{
    public static void main(String args[])
    {
    	Dog d=new Dog();
    	d.bark();
    	d.eat();
    }
}