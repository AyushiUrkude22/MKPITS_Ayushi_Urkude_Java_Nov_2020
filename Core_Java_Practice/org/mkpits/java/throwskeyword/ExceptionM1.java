package org.mkpits.java.throwskeyword;
//Program if exception does not occur.


import java.io.*;
    class  ExceptionM1{
        void method()throws IOException{
            System.out.println("device operation performed");
        }
    }

    class Testthrows3{
        public static void main(String args[])throws IOException{//declare exception
            ExceptionM1 m=new  ExceptionM1();
            m.method();

            System.out.println("normal flow...");
        }
    }