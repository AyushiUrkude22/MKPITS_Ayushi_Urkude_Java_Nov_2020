package org.mkpits.java.ExceptionHandling;
//Example of Java Exception Handling where we using a try-catch statement to handle the exception.

class JavaExceptionExample{
    public static void main(String args[]){
        try{
//code that may raise exception
            int data=100/0;

        }catch(ArithmeticException e){System.out.println(e);}
//rest code of the program
        System.out.println("rest of the code...");
    }
}
