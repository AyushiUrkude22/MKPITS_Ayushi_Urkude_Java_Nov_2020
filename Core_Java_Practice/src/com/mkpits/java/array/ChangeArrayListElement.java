package src.com.mkpits.java.array;
//Java Program to example of Change ArrayList Elements.

import java.util.ArrayList;
class ChangeArrayListElement {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        // add elements in the array list
        languages.add("Java");
        languages.add("Kotlin");
        languages.add("C++");
        System.out.println("ArrayList: " + languages);

        // change the element of the array list
        languages.set(2, "JavaScript");
        System.out.println("Modified ArrayList: " + languages);
    }
}