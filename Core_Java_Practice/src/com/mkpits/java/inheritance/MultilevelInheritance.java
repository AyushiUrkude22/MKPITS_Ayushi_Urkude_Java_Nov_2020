package src.com.mkpits.java.inheritance;
/*Write a program to BabyDog class inherits the Dog class which again inherits the Animal class,
so there is a multilevel inheritance */

class  AnimalA
{
    void eat(){System.out.println("eating...");}
}
class Dog1 extends AnimalA
{
    void bark(){System.out.println("barking...");}
}
class BabyDog1 extends Dog1
{
    void weep(){System.out.println("weeping...");}
}

class MultilevelInheritance{
    public static void main(String args[])
    {
        BabyDog1 d=new BabyDog1();
        d.weep();
        d.bark();
        d.eat();
    }
}
