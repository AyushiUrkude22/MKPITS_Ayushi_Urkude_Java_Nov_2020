package src.com.mkpits.java.abstractclass;
/*Java Program to example of the abstract class includes any abstract method, then all the child classes
inherited from the abstract superclass must provide the implementation of the abstract method. */

abstract class AbstractMethod {
    abstract void makeSound();

    public void eat() {
        System.out.println("I can eat.");
    }
}

class DogAb extends AbstractMethod {

    // provide implementation of abstract method
    public void makeSound() {
        System.out.println("Bark bark");
    }
}

class MainAb {
    public static void main(String[] args) {

        // create an object of Dog class
        DogAb d1 = new DogAb();

        d1.makeSound();
        d1.eat();
    }
}