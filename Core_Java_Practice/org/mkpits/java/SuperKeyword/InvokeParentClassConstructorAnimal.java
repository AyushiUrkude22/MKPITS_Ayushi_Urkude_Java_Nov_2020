package org.mkpits.java.SuperKeyword;
// The super keyword can also be used to invoke the parent class constructor.

class InvokeParentClassConstructorAnimal{
    void Animal(){System.out.println("animal is created");}
}
class Dog3 extends InvokeParentClassConstructorAnimal{
    Dog3(){
        super();
        System.out.println("dog is created");
    }
}
class TestSuper3{
    public static void main(String args[]){
        Dog3 d=new Dog3();
    }
}
