package org.mkpits.java.Overriding;
/* In this example, we have defined the run method in the subclass as defined in the parent class but it has
some specific implementation. The name and parameter of the method are the same, and there is IS-A
relationship between the classes, so there is method overriding */

class Vehicle
{
    void run(){System.out.println("Vehicle is running");}
}
class Bike3 extends Vehicle
{

    void run(){System.out.println("bike3 is running");}
}
class Car extends Vehicle
{
    void run(){System.out.println("car is running");}
}
//Creating a child class

class honda
{
    public static void main(String args[])
    {
//creating an instance of child class
        Bike obj = new Bike3();
//calling the method with child class instance
        obj.run();
        Car obj1 = new Car();
//calling the method with child class instance

        obj1.run();
    }
}