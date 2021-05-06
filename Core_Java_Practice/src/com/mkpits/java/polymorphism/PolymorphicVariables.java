package src.com.mkpits.java.polymorphism;
//Java Program to example of Polymorphic Variables.

class PolymorphicVariables {
    public void display() {
        System.out.println("I am Programming Language.");
    }
}

class JavaPo extends PolymorphicVariables {
    @Override
    public void display() {
        System.out.println("I am Object-Oriented Programming Language.");
    }
}

class MainPo {
    public static void main(String[] args) {

        // declare an object variable
        PolymorphicVariables pl;

        // create object of ProgrammingLanguage
        pl = new PolymorphicVariables();
        pl.display();

        // create object of Java class
        pl = new PolymorphicVariables();
        pl.display();
    }
}