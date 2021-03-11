//Simple Java program example for Multilevel Inheritance.

class Animaldogs
{
    void eat()
    {
		System.out.println("eating...");
	}
}

class Dogc extends Animal
{
    void bark()
    {
		System.out.println("barking...");
	}
}

class BabyDog extends Dog
{
    void weep()
    {
		System.out.println("weeping...");
	}
}

class MultilevelInheritancemain
{
    public static void main(String args[])
    {
    	BabyDog d=new BabyDog();
    	d.weep();
    	d.bark();
    	d.eat();
    }
}