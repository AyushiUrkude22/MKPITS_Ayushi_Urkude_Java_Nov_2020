package src.com.mkpits.java.Interface;
//Java Program to example of Interface.

// To use the sqrt function
import java.lang.Math;
interface InterfaceEx {
    void getArea();

    // calculate the perimeter of a Polygon
    default void getPerimeter(int... sides) {
        int perimeter = 0;
        for (int side: sides) {
            perimeter += side;
        }

        System.out.println("Perimeter: " + perimeter);
    }
}

class TriangleI implements InterfaceEx {
    private int a, b, c;
    private double s, area;

    // initializing sides of a triangle
    TriangleI(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }

    // calculate the area of a triangle
    public void getArea() {
        s = (double) (a + b + c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area: " + area);
    }
}

class MainIn {
    public static void main(String[] args) {
        TriangleI t1 = new TriangleI(2, 3, 4);

// calls the method of the Triangle class
        t1.getArea();

// calls the method of Polygon
        t1.getPerimeter(2, 3, 4);
    }
}