package src.com.mkpits.java.inheritance;
//Java Program to example of protected Members in Inheritance.

class ProtectedMembersInheritance {
    protected String name;

    protected void display() {
        System.out.println("I am an animal.");
    }
}

class DogEx extends ProtectedMembersInheritance {

    public void getInfo() {
        System.out.println("My name is " + name);
    }
}

class MainEx {
    public static void main(String[] args) {

        // create an object of the subclass
        DogEx labrador = new DogEx();

        // access protected field and method
        // using the object of subclass
        labrador.name = "Dodo";
        labrador.display();

        labrador.getInfo();
    }
}