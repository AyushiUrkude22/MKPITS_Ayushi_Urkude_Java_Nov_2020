package org.mkpits.java.SuperKeyword;
// Super keyword where super() is provided by the compiler implicitly.

class CompilerImplicitlyAnimal{
    void Animal(){System.out.println("animal is created");}
}
class Dog4 extends CompilerImplicitlyAnimal{
    Dog4(){
        System.out.println("dog is created");
    }
}
class TestSuper4{
    public static void main(String args[]){
        Dog4 d=new Dog4();
    }}
