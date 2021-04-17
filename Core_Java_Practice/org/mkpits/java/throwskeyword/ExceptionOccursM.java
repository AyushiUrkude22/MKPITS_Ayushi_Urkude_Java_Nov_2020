package org.mkpits.java.throwskeyword;
// Program if exception occurs.

import java.io.*;
    class ExceptionOccursM{
        void method()throws IOException{
            throw new IOException("device error");
        }
    }
    class Testthrows4{
        public static void main(String args[])throws IOException{//declare exception
            ExceptionOccursM m=new ExceptionOccursM();
            m.method();

            System.out.println("normal flow...");
        }
    }