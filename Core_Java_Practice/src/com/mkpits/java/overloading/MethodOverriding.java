package src.com.mkpits.java.overloading;
//Java Program to example of Method Overriding.

class MethodOverriding {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog extends MethodOverriding {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}