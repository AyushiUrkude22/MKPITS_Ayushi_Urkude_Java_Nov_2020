package src.com.mkpits.java.superkeyword;
/* We can use super keyword to access the data member or field of parent class. It is used if parent class
and child class have same fields */

class ParentClassChildClassHaveSameFieldsAnimal{
    String color="white";
 }
    class Dog extends ParentClassChildClassHaveSameFieldsAnimal{
    String color="black";
    void printColor()
    {
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
 }

class TestSuper1{
    public static void main(String args[]){
        Dog d=new Dog();
        d.printColor();
    }
}

