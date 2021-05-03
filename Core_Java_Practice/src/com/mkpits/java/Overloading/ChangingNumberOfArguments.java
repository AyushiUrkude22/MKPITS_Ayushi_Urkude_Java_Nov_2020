package src.com.mkpits.java.Overloading;
/* We have created two methods, first add() method performs addition of two numbers and
second add method performs addition of three numbers*/

class Adder{
    static int add(int a,int b) {return a+b;}
    static int add(int a,int b,int c) {return a+b+c;}

    public static void add(double v, double v1) {
    }
}

class ChangingNumberOfArguments{
    public static void main(String[] args)
    {
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
    }
}
