package src.com.mkpits.java.array;
//Java Program to  search the minimum and the maximum element in an array.

public class SearchArray {
    public static void main(String[] args) {
        int numbers[] = new int[]{81, 25, 47, 81, 46, 91, 55};
        int s = numbers[0];
        int l = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > l)l = numbers[i];
            else if (numbers[i] < s)s = numbers[i];
        }
        System.out.println("Largest Number is : " + l);
        System.out.println("Smallest Number is : " + s);
    }
}
