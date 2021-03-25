package org.mkpits.java.thiskeyword;
//Write a program to Calling parameterized constructor from default constructor.

class C{
    C(){
        this(5);
        System.out.println("hello a");

    }
    C(int x){
        System.out.println(x);
    }
}
class CallingParameterizedConstructorFromDefaultConstructor
{
    public static void main(String args[])
    {
        C a=new C();
    }
}
