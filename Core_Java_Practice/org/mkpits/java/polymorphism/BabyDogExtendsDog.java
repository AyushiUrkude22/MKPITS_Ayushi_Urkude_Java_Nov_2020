package org.mkpits.java.polymorphism;
// Java Runtime Polymorphism with Multilevel Inheritance.

class Animal1{
    void eat(){System.out.println("eating");}
}
class Dog1 extends Animal1{
    void eat(){System.out.println("eating fruits");}
}
class BabyDog1 extends Dog1{
    void eat(){System.out.println("drinking milk");}
    public static void main(String args[]){
        Animal1 a1,a2,a3;
        a1=new Animal1();
        a2=new Dog1();
        a3=new BabyDog1();
        a1.eat();
        a2.eat();
        a3.eat();
    }
}