package src.com.mkpits.java.ArrayList;
//Java Program to example of ArrayList to String Conversion.

import java.util.ArrayList;
class ArrayListToStringConversion {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        // add elements in the ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        System.out.println("ArrayList: " + languages);

        // convert ArrayList into a String
        String str = languages.toString();
        System.out.println("String: " + str);
    }
}
