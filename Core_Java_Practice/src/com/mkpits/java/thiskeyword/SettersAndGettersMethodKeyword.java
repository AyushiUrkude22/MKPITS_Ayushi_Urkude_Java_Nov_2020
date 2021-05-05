package src.com.mkpits.java.thiskeyword;
//Java Program to example of use of this keyword is in setters and getters methods of a class.

class SettersAndGettersMethodKeyword {
    String name;

    // setter method
    void setName( String name ) {
        this.name = name;
    }

    // getter method
    String getName(){
        return this.name;
    }

    public static void main( String[] args ) {
        SettersAndGettersMethodKeyword obj = new SettersAndGettersMethodKeyword();

        // calling the setter and the getter method
        obj.setName("Akshay");
        System.out.println("obj.name: "+obj.getName());
    }
}