package org.mkpits.java.Staticnestedclass;
// Java static nested class example with static method.

class StaticNestedClassExample1{
        static int data=30;
        static class Inner{
            static void msg(){System.out.println("data is "+data);}
        }
        public static void main(String args[]){
            StaticNestedClassExample1.Inner.msg();//no need to create the instance of static nested class
        }
    }
