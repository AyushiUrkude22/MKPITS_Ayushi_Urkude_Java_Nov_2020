package src.com.mkpits.java.controlflowstatement;
//Java Program to example of Sum of Array Elements.

class SumOfArrayElements {
    public static void main(String[] args) {

        // an array of numbers
        int[] numbers = {3, 4, 5, -5, 0, 12};
        int sum = 0;

        // iterating through each element of the array
        for (int number: numbers) {
            sum += number;
        }

        System.out.println("Sum = " + sum);
    }
}