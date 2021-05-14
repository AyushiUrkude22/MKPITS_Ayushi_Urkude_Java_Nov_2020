package src.com.mkpits.java.nestedInterface;
//Java Program to example of Static Nested Class.

class StaticNestedClass {

    // inner class
    class Reptile {
        public void displayInfo() {
            System.out.println("I am a reptile.");
        }
    }

    // static class
    static class Mammal {
        public void displayInfo() {
            System.out.println("I am a mammal.");
        }
    }
}

class MainSn {
    public static void main(String[] args) {
        // object creation of the outer class
        StaticNestedClass animal = new StaticNestedClass();

        // object creation of the non-static class
        StaticNestedClass.Reptile reptile = animal.new Reptile();
        reptile.displayInfo();

        // object creation of the static nested class
        StaticNestedClass.Mammal mammal = new StaticNestedClass.Mammal();
        mammal.displayInfo();

    }
}