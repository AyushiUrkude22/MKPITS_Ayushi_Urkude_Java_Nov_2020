package org.mkpits.java.InstanceInitializerBlock;
//What is invoked first, instance initializer block or constructor.

class InvokedBike{
    int speed;

    InvokedBike(){System.out.println("constructor is invoked");}

    {System.out.println("instance initializer block invoked");}

    public static void main(String args[]){
        InvokedBike b1=new InvokedBike();
        InvokedBike b2=new InvokedBike();
    }
}


