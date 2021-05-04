package src.com.mkpits.java.oops;
//Java Program to example of Java Methods.

class JavaMethod {

    // create a method
    public int addNumbers(int a, int b) {
        int sum = a + b;
        // return value
        return sum;
    }

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 15;

        // create an object of Main
        JavaMethod obj = new JavaMethod();
        // calling method
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is: " + result);
    }
}