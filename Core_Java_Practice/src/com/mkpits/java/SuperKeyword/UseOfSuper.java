package src.com.mkpits.java.SuperKeyword;
//Java Program to example of Use of super().

class AnimalA {

    // default or no-arg constructor of class Animal
    AnimalA() {
        System.out.println("I am an animal");
    }
}

class DogA extends AnimalA {

    // default or no-arg constructor of class Dog
    DogA() {

        // calling default constructor of the superclass
        super();

        System.out.println("I am a dog");
    }
}

class MainA {
    public static void main(String[] args) {
        DogA dog1 = new DogA();
    }
}