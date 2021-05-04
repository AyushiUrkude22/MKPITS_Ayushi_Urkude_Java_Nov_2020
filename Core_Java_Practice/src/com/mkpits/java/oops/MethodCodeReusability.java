package src.com.mkpits.java.oops;
//Java Program to example of Method for Code Reusability.

public class MethodCodeReusability {

    // method defined
    private static int getSquare(int x){
        return x * x;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            // method call
            int result = getSquare(i);
            System.out.println("Square of " + i + " is: " + result);
        }
    }
}