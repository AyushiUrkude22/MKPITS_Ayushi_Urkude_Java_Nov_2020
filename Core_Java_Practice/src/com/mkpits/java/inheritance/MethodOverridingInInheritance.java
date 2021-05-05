package src.com.mkpits.java.inheritance;
//Java Program to example of Method overriding in Java Inheritance.

class MethodOverridingInInheritance {

    // method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Dog inherits MethodOverridingInInheritance
class Dogg extends MethodOverridingInInheritance {

    // overriding the eat() method
    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }

    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of the subclass
        Dogg labrador = new Dogg();

        // call the eat() method
        labrador.eat();
        labrador.bark();
    }
}