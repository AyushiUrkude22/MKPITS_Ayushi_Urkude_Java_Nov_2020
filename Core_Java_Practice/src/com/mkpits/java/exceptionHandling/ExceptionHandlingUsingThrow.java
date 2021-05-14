package src.com.mkpits.java.exceptionHandling;
//Java Program to example Exception handling using Java throw.

class ExceptionHandlingUsingThrow {
    public static void divideByZero() {

        // throw an exception
        throw new ArithmeticException("Trying to divide by 0");
    }

    public static void main(String[] args) {
        divideByZero();
    }
}