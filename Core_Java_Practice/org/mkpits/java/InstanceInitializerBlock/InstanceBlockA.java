package org.mkpits.java.InstanceInitializerBlock;
//Java program Example of Instance Block.

class InstanceBlockA{
    void A(){
        System.out.println("parent class constructor invoked");
    }
}

class B3 extends InstanceBlockA{
    B3(){
        super();
        System.out.println("child class constructor invoked");
    }

    B3(int a){
        super();
        System.out.println("child class constructor invoked "+a);
    }

    {System.out.println("instance initializer block is invoked");}

    public static void main(String args[]){
        B3 b1=new B3();
        B3 b2=new B3(10);
    }
}