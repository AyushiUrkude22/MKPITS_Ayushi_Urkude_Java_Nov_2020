package org.mkpits.java.ExceptionHandlingwithMethodOverriding;
/* If the superclass method does not declare an exception, subclass overridden method cannot
declare the checked exception. */

import java.io.*;
    class ExceptionParent{
        void msg() throws IOException {System.out.println("parent");}
    }

    class TestExceptionChild extends ExceptionParent{
        void msg()throws IOException{
            System.out.println("TestExceptionChild");
        }
        public static void main(String args[]) throws IOException {
            ExceptionParent p=new TestExceptionChild();
            p.msg();
        }
    }
