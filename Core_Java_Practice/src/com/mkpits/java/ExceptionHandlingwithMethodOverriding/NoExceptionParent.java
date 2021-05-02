package org.mkpits.java.ExceptionHandlingwithMethodOverriding;
// Example in case subclass overridden method declares no exception.

import java.io.*;
class NoExceptionParent{
        void msg()throws Exception{System.out.println("parent");}
    }

    class TestExceptionChild5 extends Parent{
        void msg(){System.out.println("child");}

        public static void main(String args[]){
            Parent p=new TestExceptionChild5();
            try{
                p.msg();
            }catch(Exception e){}
        }
    }