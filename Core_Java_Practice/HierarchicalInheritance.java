//Simple Java program example for Hierarchical Inheritance.

class Animals
{
    void eat()
    {
    	System.out.println("eating...");
    }
}

class Dogs extends Animals
{
    void bark()
    {
    	System.out.println("barking...");
    }
}

class Cat extends Animals
{
    void meow()
    {
    	System.out.println("meowing...");
    }
}

class HierarchicalInheritance
{
    public static void main(String[] args)
    {
    	Cat c=new Cat();
    	c.meow();
    	c.eat();
    	//c.bark();//C.T.Error
    	Dog d = new Dog();
    	d.bark();
    	d.eat();
    }
}