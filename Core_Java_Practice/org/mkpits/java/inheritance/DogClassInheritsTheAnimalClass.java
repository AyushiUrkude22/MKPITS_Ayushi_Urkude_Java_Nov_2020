package org.mkpits.java.inheritance;
/* When a class inherits another class, it is known as a single inheritance.Dog
class inherits the Animal class, so there is the single inheritance */

class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal
{
    void bark(){System.out.println("barking...");}
}

class DogClassInheritsTheAnimalClass
{
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}
