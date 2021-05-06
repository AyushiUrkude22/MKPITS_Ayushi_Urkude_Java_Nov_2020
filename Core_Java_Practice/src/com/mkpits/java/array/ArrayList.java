package src.com.mkpits.java.array;
//Java Program to example of Create ArrayList in Java.

import java.util.ArrayList;
class Main {
    public static void main(String[] args){

        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // Add elements to ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        System.out.println("ArrayList: " + languages);
    }
}