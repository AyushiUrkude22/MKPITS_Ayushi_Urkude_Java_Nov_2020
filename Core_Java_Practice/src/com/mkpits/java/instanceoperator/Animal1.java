package org.mkpits.java.instanceoperator;
//Downcasting can also be performed without the use of instanceof operator as displayed in the following example.

class Animal1 { }
class Dog3 extends Animal1 {
    static void method(Animal1 a) {
        Dog3 d=(Dog3)a;//downcasting
        System.out.println("ok downcasting performed");
    }
    public static void main (String [] args) {
        Animal1 a=new Dog3();
        Dog3.method(a);
    }

}