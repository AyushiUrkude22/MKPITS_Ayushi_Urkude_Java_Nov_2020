package src.com.mkpits.java.instanceInitializerBlock;
//The instance initializer block comes in the order in which they appear.

class Bike
{
    Bike()
    {

        {System.out.println("bike constructor called");}
    }
}

class Bike8 extends Bike{
    int speed;
    {System.out.println("instance initializer block invoked");}
    Bike8()
    {

//super();
//System.out.println("instance initializer block invoked");
        System.out.println("bike8 constructor is invoked");
    }

    public static void main(String args[]){
        Bike8 b1=new Bike8();
// Bike8 b2=new Bike8();
    }
}