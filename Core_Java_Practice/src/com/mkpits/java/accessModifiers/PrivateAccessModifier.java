package src.com.mkpits.java.accessModifiers;
//Java Program to example of java Private Access Modifier.

class PrivateAccessModifier  {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
class Main {
    public static void main(String[] main){
        PrivateAccessModifier  d = new PrivateAccessModifier ();

        // access the private variable using the getter and setter
        d.setName("Ayushi");
        System.out.println(d.getName());
    }
}