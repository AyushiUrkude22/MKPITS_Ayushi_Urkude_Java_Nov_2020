package src.com.mkpits.java.SuperKeyword;
//Java Program to example of super to Call Superclass Method.

class SuperToCallSuperclassMethod {

    // overridden method
    public void display(){
        System.out.println("I am an animal");
    }
}

class Dog6 extends SuperToCallSuperclassMethod {

    // overriding method
    @Override
    public void display(){
        System.out.println("I am a dog");
    }

    public void printMessage(){

        // this calls overriding method
        display();

        // this calls overridden method
        super.display();
    }
}

class Main6 {
    public static void main(String[] args) {
        Dog6 dog1 = new Dog6();
        dog1.printMessage();
    }
}
