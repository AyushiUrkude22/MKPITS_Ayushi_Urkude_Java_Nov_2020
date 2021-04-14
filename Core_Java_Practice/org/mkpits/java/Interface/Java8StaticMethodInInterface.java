package org.mkpits.java.Interface;
// Since Java 8, we can have static method in interface. Let's see an example:

interface DrawableA{
    void draw();
    static int cube(int x){return x*x*x;}
}
class RectangleA implements DrawableA{
    public void draw(){System.out.println("drawing rectangle");}
}

class TestInterfaceStatic{
    public static void main(String args[]){
        DrawableA d=new RectangleA();
        d.draw();
        System.out.println(Drawable.cube(3));
    }}
