package src.com.mkpits.java.constructor;
//Java Program to example of java Constructor.

class Constructor {
    private String name;

    // constructor
    Constructor() {
        System.out.println("Constructor Called:");
        name = "Ayushi";
    }

    public static void main(String[] args) {

        // constructor is invoked while
        // creating an object of the Main class
        Constructor obj = new Constructor();
        System.out.println("The name is " + obj.name);
    }
}