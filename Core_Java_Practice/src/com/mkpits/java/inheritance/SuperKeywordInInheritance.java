package src.com.mkpits.java.inheritance;
//Java Program to example of super Keyword in Inheritance.

class SuperKeywordInInheritance {

    // method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Dog inherits Animal
class DogK extends SuperKeywordInInheritance {

    // overriding the eat() method
    @Override
    public void eat() {

        // call method of superclass
        super.eat();
        System.out.println("I eat dog food");
    }

    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

class MainK {
    public static void main(String[] args) {

        // create an object of the subclass
        DogK labrador = new DogK();

        // call the eat() method
        labrador.eat();
        labrador.bark();
    }
}