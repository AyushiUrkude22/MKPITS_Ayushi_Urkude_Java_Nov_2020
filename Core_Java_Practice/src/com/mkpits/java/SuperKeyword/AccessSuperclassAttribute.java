package src.com.mkpits.java.SuperKeyword;
//Java Program to example of Access superclass attribute.

class AccessSuperclassAttribute {
    protected String type="animal";
}

class Dog7 extends AccessSuperclassAttribute {
    public String type="mammal";

    public void printType() {
        System.out.println("I am a " + type);
        System.out.println("I am an " + super.type);
    }
}

class Main7 {
    public static void main(String[] args) {
        Dog7 dog1 = new Dog7();
        dog1.printType();
    }
}