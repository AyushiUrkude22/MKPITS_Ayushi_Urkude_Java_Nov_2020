package src.com.mkpits.java.ExceptionHandling;
//Java Program to example Exception Handling using finally block.

class  ExceptionHandlingUsingFinallyBlock{
    public static void main(String[] args) {
        try {
            // code that generates exception
            int divideByZero = 5 / 0;
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }

        finally {
            System.out.println("This is the finally block");
        }
    }
}