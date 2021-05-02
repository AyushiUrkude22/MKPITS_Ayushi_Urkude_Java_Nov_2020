package org.mkpits.java.SuperKeyword;
/* Animal and Dog both classes have a common property color. If we print color proprty,
 it will print the color of current class by default. To access the parent property, we need to use super keyword */

class Animal
{
    String color="white";
}
class Dog1 extends Animal
{
    String color="black";
    void printColor()
    {

        System.out.println(super.color);//prints color of Animal class
    }
}

class BabyDog1 extends Dog1
{
    String color="brown";
    void printColor1()
    {

        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
        printColor();
    }
}

class TestSuper
{
    public static void main(String args[])
    {
        BabyDog1 d=new BabyDog1();
        d.printColor1();
    }
}