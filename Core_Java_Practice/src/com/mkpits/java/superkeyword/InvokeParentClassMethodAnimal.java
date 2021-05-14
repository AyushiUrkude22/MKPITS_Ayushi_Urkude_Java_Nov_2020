package src.com.mkpits.java.superkeyword;
/* The super keyword can also be used to invoke parent class method. It should be used if subclass
contains the same method as parent class. In other words, it is used if method is overridden */

class InvokeParentClassMethodAnimal{
    void eat(){System.out.println("eating...");}
}
class Dog2 extends InvokeParentClassMethodAnimal{
    void eat(){System.out.println("eating bread...");}
    void bark(){System.out.println("barking...");}
    void work()
    {
        super.eat();
        bark();
    }
}
class TestSuper2{
    public static void main(String args[]){
        Dog2 d=new Dog2();
        d.work();
    }
}
