package src.com.mkpits.java.anonymousinnerclass;
//Java Program to example of Anonymous Class Implementing an Interface.

interface AnonymousClassImplementingInterface {
    public void display();
}

class AnonymousDemo1 {
    public void createClass() {

        // anonymous class implementing interface
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}

class Main1 {
    public static void main(String[] args) {
        AnonymousDemo1 an = new AnonymousDemo1();
        an.createClass();
    }
}
