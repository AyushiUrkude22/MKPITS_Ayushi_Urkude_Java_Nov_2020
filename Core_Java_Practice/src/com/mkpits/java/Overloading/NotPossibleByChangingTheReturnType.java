package org.mkpits.java.Overloading;
//In java, method overloading is not possible by changing the return type of the method only because of ambiguity.

class Adder3
{
    static double add(int b){return 11 +b;}
}

class NotPossibleByChangingTheReturnType{
    public static void main(String[] args)
    {
        System.out.println(Adder3.add(11));//ambiguity
    }
}