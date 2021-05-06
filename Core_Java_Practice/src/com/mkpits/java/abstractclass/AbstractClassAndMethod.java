package src.com.mkpits.java.abstractclass;
//Java Program to example of Abstract Class and Method.

abstract class AbstractClassAndMethod {

    // method of abstract class
    public void display() {
        System.out.println("This is Java Programming");
    }
}

class Main extends AbstractClassAndMethod {

    public static void main(String[] args) {

        // create an object of Main
        Main obj = new Main();

        // access method of abstract class
        // using object of Main class
        obj.display();
    }
}