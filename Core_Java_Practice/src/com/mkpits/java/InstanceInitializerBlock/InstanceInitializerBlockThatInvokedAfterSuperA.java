package org.mkpits.java.InstanceInitializerBlock;
//Program of instance initializer block that is invoked after super().

class InstanceInitializerBlockThatInvokedAfterSuperA{
    void A(){
        System.out.println("parent class constructor invoked");
    }
}
class B2 extends InstanceInitializerBlockThatInvokedAfterSuperA{
    B2(){
        super();
        System.out.println("child class constructor invoked");
    }

    {System.out.println("instance initializer block is invoked");}

    public static void main(String args[]){
        B2 b=new B2();
    }
}
