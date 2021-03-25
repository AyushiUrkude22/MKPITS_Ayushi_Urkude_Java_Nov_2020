package org.mkpits.java.aggregation;
//Write a program to creating a class circle having field area.

class operation
{
    int square(int r)
    {
        return r*r;
    }
}

class circle
{
    operation op;
    double pi=3.14;
    double area(int r)
    {
        operation op=new operation();
        int sq=op.square(r);
        double ar= pi * sq;
        return ar;
    }

}
/////////
class CreateClassCircle
{
    public static void main(String[] arg)
    {
        circle c=new circle();
        double res=c.area(6);
        System.out.println("square of a circle is " + res);
    }
}
