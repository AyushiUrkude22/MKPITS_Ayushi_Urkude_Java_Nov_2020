package src.com.mkpits.java.polymorphism;
// BabyDog is not overriding the eat() method, so eat() method of Dog class is invoked.

class Animal2{
    void eat(){System.out.println("animal is eating...");}
}
class Dog2 extends Animal2{
    void eat(){System.out.println("dog is eating...");}
}

class BabyDog2 extends Dog2{
    public static void main(String args[]){
        Animal2 a=new BabyDog2();
        a.eat();
    }}