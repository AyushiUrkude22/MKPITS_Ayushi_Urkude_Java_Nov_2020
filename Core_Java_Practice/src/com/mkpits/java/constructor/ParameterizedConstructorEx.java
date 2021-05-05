package src.com.mkpits.java.constructor;
//Java Program to example of Parameterized constructor.

class ParameterizedConstructorEx {

    String languages;

    // constructor accepting single value
    ParameterizedConstructorEx(String lang) {
        languages = lang;
        System.out.println(languages + " Programming Language");
    }

    public static void main(String[] args) {

        // call constructor by passing a single value
        ParameterizedConstructorEx obj1 = new ParameterizedConstructorEx("Java");
        ParameterizedConstructorEx obj2 = new ParameterizedConstructorEx("Python");
        ParameterizedConstructorEx obj3 = new ParameterizedConstructorEx("C");
    }
}
