package src.com.mkpits.java.constructor;
//Java Program to example of public no-arg constructors.

class PublicNoArgConstructor  {
    String name;

    // public constructor
    public PublicNoArgConstructor () {
        name = "Akshay";
    }
}

class Main {

    public static void main(String[] args) {

        // object is created in another class
        PublicNoArgConstructor  obj = new PublicNoArgConstructor ();
        System.out.println("Company name = " + obj.name);
    }
}