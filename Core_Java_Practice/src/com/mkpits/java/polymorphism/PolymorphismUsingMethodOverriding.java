package src.com.mkpits.java.polymorphism;
//Java Program to example of Polymorphism using method overriding.

class PolymorphismUsingMethodOverriding {
    public void displayInfo() {
        System.out.println("Common English Language");
    }
}

class Java extends PolymorphismUsingMethodOverriding {
    @Override
    public void displayInfo() {
        System.out.println("Java Programming Language");
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of Java class
        Java j1 = new Java();
        j1.displayInfo();

        // create an object of Language class
        PolymorphismUsingMethodOverriding l1 = new PolymorphismUsingMethodOverriding();
        l1.displayInfo();
    }
}