package src.com.mkpits.java.SuperKeyword;
//Java Program to example of Access Overridden Methods of the superclass.

class AccessOverriddenMethodOfSuperclass {

    // overridden method
    public void display(){
        System.out.println("I am an animal");
    }
}

class Dog5 extends AccessOverriddenMethodOfSuperclass {

    // overriding method
    @Override
    public void display(){
        System.out.println("I am a dog");
    }

    public void printMessage(){
        display();
    }
}

class Main5 {
    public static void main(String[] args) {
        Dog5 dog1 = new Dog5();
        dog1.printMessage();
    }
}

