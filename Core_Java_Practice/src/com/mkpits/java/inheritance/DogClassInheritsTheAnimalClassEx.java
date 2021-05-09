package src.com.mkpits.java.inheritance;
//In the example given below, Dog class inherits the Animal class, so there is the single inheritance.

class DogClassInheritsTheAnimalClassExl{
    void eat(){System.out.println("eating...");}
}
class DogExl extends DogClassInheritsTheAnimalClassExl{
    void bark(){System.out.println("barking...");}
}
class TestInheritance{
    public static void main(String args[]){
        DogExl d=new DogExl();
        d.bark();
        d.eat();
    }}