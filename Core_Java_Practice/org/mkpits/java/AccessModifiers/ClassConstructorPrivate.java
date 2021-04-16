package org.mkpits.java.AccessModifiers;
/* If you make any class constructor private, you cannot create the instance of that class from outside the
class. For example */

class Abc{
    private Abc(){}//private constructor
    void msg(){System.out.println("Hello java");}
}
class Simple2{

    public static void main(String args[]){
        Abc obj=new Abc();//Compile Time Error
    }
}
