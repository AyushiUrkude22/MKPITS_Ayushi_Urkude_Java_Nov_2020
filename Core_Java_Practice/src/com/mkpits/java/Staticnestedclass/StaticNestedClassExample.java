package src.com.mkpits.java.Staticnestedclass;
//Java static nested class example with instance method.

class StaticNestedClassExample{
    static int data=30;
    static class Inner{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        StaticNestedClassExample.Inner obj=new StaticNestedClassExample.Inner();
        obj.msg();
    }
}