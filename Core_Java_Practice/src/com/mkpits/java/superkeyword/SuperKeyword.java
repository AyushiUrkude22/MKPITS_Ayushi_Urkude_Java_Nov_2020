package src.com.mkpits.java.superkeyword;
//Java Program to example of super Keyword.

class SuperKeyword {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dogs extends SuperKeyword {
    public void displayInfo() {
        super.displayInfo();
        System.out.println("I am a dog.");
    }
}

class Main {
    public static void main(String[] args) {
        Dogs d1 = new Dogs();
        d1.displayInfo();
    }
}
