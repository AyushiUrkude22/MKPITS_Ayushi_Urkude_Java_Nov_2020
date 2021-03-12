//Java program to demonstrate Runtime polymorphism using Shape class.

class Shapes
{
    void draw()
    {
		System.out.println("drawing...");
    }
}
class Rectangles extends Shapes
{
    void draw()
    {
		System.out.println("drawing rectangle...");
    }
}
class Circles extends Shapes
{
    void draw()
    {
		System.out.println("drawing circle...");
    }
}
class Triangle extends Shape
{
    void draw()
    {
		System.out.println("drawing triangle...");
    }
}

class PolymorphismEx2
{
    public static void main(String args[])
    {
    	Shape s;
    	s=new Rectangle();
    	s.draw();
    	s=new Circle();
    	s.draw();
    	s=new Triangle();
    	s.draw();
    }
}