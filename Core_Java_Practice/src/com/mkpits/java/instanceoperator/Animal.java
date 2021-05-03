package src.com.mkpits.java.instanceoperator;
/* An object of subclass type is also a type of parent class. For example, if Dog extends Animal then object
of Dog can be referred by either Dog or Animal class. */

class Animal{}
class Dog1 extends Animal
{//Dog inherits Animal
    public static void main(String args[]){
        Dog1 d=new Dog1();
        System.out.println(d instanceof Animal);//true
    }
}