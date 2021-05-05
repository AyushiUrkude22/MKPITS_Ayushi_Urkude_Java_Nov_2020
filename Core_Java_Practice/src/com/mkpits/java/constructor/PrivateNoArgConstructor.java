package src.com.mkpits.java.constructor;
//Java Program to example of private no-arg constructor.

class PrivateNoArgConstructor {

    int i;

    // constructor with no parameter
    private PrivateNoArgConstructor() {
        i = 5;
        System.out.println("Constructor is called");
    }

    public static void main(String[] args) {

        // calling the constructor without any parameter
        PrivateNoArgConstructor obj = new PrivateNoArgConstructor();
        System.out.println("Value of i: " + obj.i);
    }
}