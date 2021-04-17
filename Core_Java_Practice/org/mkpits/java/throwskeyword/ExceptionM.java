package org.mkpits.java.throwskeyword;
/* In case you handle the exception, the code will be executed fine whether exception occurs during the
program or not. */

import java.io.*;

    class ExceptionM{
        void method()throws IOException{
            throw new IOException("device error");
        }
    }
    class Testthrows2{
        public static void main(String args[]){
            try{
                ExceptionM m=new ExceptionM();
                m.method();
            }catch(Exception e){System.out.println("exception handled");}

            System.out.println("normal flow...");
        }
    }