package src.com.mkpits.java.Interface;
//Java Program to example of Interface.

interface Polygon {
    void getArea(int length, int breadth);
}

// implement the Polygon interface
class RectangleA implements Polygon {

    // implementation of abstract method
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}

class Main {
    public static void main(String[] args) {
        RectangleA r1 = new RectangleA();
        r1.getArea(5, 6);
    }
}