package src.com.mkpits.java.Overloading;
//Java Program to example of Access Specifier in Overriding.

class AccessSpecifierInOverriding {
    protected void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class DogEx1 extends AccessSpecifierInOverriding {
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}

class MainEx1 {
    public static void main(String[] args) {
        DogEx1 d1 = new DogEx1();
        d1.displayInfo();
    }
}