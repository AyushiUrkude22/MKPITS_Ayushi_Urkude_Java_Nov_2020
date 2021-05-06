package src.com.mkpits.java.polymorphism;
//Java Program to example of java Polymorphism.

class Polymorphism {

    // method to render a shape
    public void render() {
        System.out.println("Rendering Polygon...");
    }
}

class Square extends Polymorphism {

    // renders Square
    public void render() {
        System.out.println("Rendering Square...");
    }
}

class CircleP extends Polymorphism {

    // renders circle
    public void render() {
        System.out.println("Rendering Circle...");
    }
}

class MainP {
    public static void main(String[] args) {

        // create an object of Square
        Square s1 = new Square();
        s1.render();

        // create an object of Circle
        CircleP c1 = new CircleP();
        c1.render();
    }
}