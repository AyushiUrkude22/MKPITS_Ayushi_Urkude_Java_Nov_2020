package src.com.mkpits.java.superkeyword;
//Java Program to example of Call Parameterized Constructor Using super().

class CallParameterizedConstructorUsingSuper {

    // default or no-arg constructor
    CallParameterizedConstructorUsingSuper() {
        System.out.println("I am an animal");
    }

    // parameterized constructor
    CallParameterizedConstructorUsingSuper(String type) {
        System.out.println("Type: "+type);
    }
}

class DogB extends CallParameterizedConstructorUsingSuper {

    // default constructor
    DogB() {

        // calling parameterized constructor of the superclass
        super("Animal");

        System.out.println("I am a dog");
    }
}

class MainB {
    public static void main(String[] args) {
        DogB dog1 = new DogB();
    }
}
