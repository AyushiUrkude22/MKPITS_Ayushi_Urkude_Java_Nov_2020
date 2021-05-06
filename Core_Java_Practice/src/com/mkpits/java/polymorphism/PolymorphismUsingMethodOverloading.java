package src.com.mkpits.java.polymorphism;
//Java Program to example of Polymorphism using method overloading.

class PolymorphismUsingMethodOverloading {

    // method without parameter
    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
    }

    // method with single parameter
    public void display(char symbol) {
        for (int i = 0; i < 10; i++) {
            System.out.print(symbol);
        }
    }
}

class MainOv {
    public static void main(String[] args) {
        PolymorphismUsingMethodOverloading d1 = new PolymorphismUsingMethodOverloading();

        // call method without any argument
        d1.display();
        System.out.println("\n");

        // call method with a single argument
        d1.display('#');
    }
}