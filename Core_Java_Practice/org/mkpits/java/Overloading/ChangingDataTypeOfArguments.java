package org.mkpits.java.Overloading;
/*we have created two methods that differs in data type. The first add method receives
two integer arguments and second add method receives two double arguments */

class Adder1{
    static int add(int a, int b){return a+b;}
    static double add(double a, double b){return a+b;}
}

class ChangingDataTypeOfArguments{
    public static void main(String[] args)

    {

        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(12.3,12.6));
    }
}