package org.mkpits.java.instanceoperator;
//The example, where downcasting is possible by instanceof operator.

class DowncastingAnimal { }

class Dog2 extends DowncastingAnimal {
    static void method(Animal a) {
        if(a instanceof Dog2){
            Dog2 d=(Dog2)a;//downcasting
            System.out.println("ok downcasting performed");
        }
    }

    public static void main (String [] args) {
        DowncastingAnimal a=new Dog2();
        Dog2.method(a);
    }

}
