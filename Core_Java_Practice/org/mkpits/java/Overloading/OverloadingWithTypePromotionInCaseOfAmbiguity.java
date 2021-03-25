package org.mkpits.java.Overloading;
//Write a program to Method Overloading with Type Promotion in case of ambiguity.

class OverloadingWithTypePromotionInCaseOfAmbiguity {
    void sum(int a,long b){System.out.println("a method invoked");}
    void sum(long a,int b){System.out.println("b method invoked");}

    public static void main(String args[]){
        OverloadingWithTypePromotionInCaseOfAmbiguity obj=new OverloadingWithTypePromotionInCaseOfAmbiguity();

        obj.sum(20,20);//now ambiguity
    }
}