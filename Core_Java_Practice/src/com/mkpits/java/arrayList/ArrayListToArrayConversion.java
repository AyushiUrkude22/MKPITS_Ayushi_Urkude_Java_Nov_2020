package src.com.mkpits.java.arrayList;
//Java Program to example of the ArrayList To Array Conversion.

import java.util.ArrayList;
class ArrayListToArrayConversion {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        // add elements in the array list
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        System.out.println("ArrayList: " + languages);

        // create a new array of String type
        String[] arr = new String[languages.size()];

        // convert ArrayList into an array
        languages.toArray(arr);
        System.out.print("Array: ");

        // access elements of the array
        for (String item : arr) {
            System.out.print(item + ", ");
        }
    }
}