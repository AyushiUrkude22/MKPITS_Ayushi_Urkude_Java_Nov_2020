package org.mkpits.java.Interface;
// Since Java 8, we can have method body in interface. But we need to make it default method. Let's see an example:

interface Drawable1{
    void draw();
    default void msg(){System.out.println("default method");}
}
class Rectangle1 implements Drawable1{
    public void draw(){System.out.println("drawing rectangle");}
}
class TestInterfaceDefault{
    public static void main(String args[]){
        Drawable1 d=new Rectangle1();
        d.draw();
        d.msg();
    }
}
