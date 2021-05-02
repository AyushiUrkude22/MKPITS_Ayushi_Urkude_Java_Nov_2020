package org.mkpits.java.thiskeyword;
//Write a program to The this keyword can also be passed as an argument in the method.

class PassArgumentInTheMethod {
    void m(PassArgumentInTheMethod obj){
        System.out.println("method is invoked");
    }
    void p(){
        m(this);
    }
    public static void main(String args[]){
        PassArgumentInTheMethod s1 = new PassArgumentInTheMethod();
        s1.p();
    }
}