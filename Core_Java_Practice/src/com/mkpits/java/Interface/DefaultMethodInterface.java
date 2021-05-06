package src.com.mkpits.java.Interface;
//Java Program to example of Default Method in Java Interface.

interface DefaultMethodInterface {
    void getArea();

    // default method
    default void getSides() {
        System.out.println("I can get sides of a polygon.");
    }
}

// implements the interface
class RectangleD implements DefaultMethodInterface {
    public void getArea() {
        int length = 6;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("The area of the rectangle is " + area);
    }

    // overrides the getSides()
    public void getSides() {
        System.out.println("I have 4 sides.");
    }
}

// implements the interface
class SquareD implements DefaultMethodInterface {
    public void getArea() {
        int length = 5;
        int area = length * length;
        System.out.println("The area of the square is " + area);
    }
}

class MainD {
    public static void main(String[] args) {

        // create an object of Rectangle
        RectangleD r1 = new RectangleD();
        r1.getArea();
        r1.getSides();

        // create an object of Square
        SquareD s1 = new SquareD();
        s1.getArea();
        s1.getSides();
    }
}