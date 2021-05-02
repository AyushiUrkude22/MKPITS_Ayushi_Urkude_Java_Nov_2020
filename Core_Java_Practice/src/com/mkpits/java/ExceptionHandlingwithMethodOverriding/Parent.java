package org.mkpits.java.ExceptionHandlingwithMethodOverriding;
//Example in case subclass overridden method declares same exception.

import java.io.*;
    class Parent{
        void msg()throws Exception{System.out.println("parent");}
    }

    class TestExceptionChild3 extends Parent{
        void msg()throws Exception{System.out.println("child");}

        public static void main(String args[]){
            Parent p=new TestExceptionChild3();
            try{
                p.msg();
            }catch(Exception e){}
        }
    }