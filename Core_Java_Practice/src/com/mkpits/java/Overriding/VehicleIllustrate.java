package src.com.mkpits.java.Overriding;
//Java Program to illustrate the use of Java Method Overriding.

class VehicleIllustrate{
    //defining a method
    void run(){System.out.println("Vehicle is running");}
}
//Creating a child class
class Bike2 extends VehicleIllustrate{
    //defining the same method as in the parent class
    void run(){System.out.println("Bike is running safely");}

    public static void main(String args[]){
        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method
    }
}