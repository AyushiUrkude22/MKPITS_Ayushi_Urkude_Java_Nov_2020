package src.com.mkpits.java.finalkeyword;
//Java Program to example of the final method cannot be overridden by the child class.

class FinalMethod {
    // create a final method
    public void display() {
        System.out.println("This is a final method.");
    }
}

class Main extends FinalMethod {
    // try to override final method
    public final void display() {
        System.out.println("The final method is overridden.");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.display();
    }
}