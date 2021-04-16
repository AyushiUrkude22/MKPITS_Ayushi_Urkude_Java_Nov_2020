//Java program to demonstrate Runtime polymorphism using Shape class.

class Shapes1
{
    void draw()
    {
		System.out.println("drawing...");
    }
}
class Rectangles1 extends Shapes1
{
    void draw()
    {
		System.out.println("drawing rectangle...");
    }
}
class Circles1 extends Shapes1
{
    void draw()
    {
		System.out.println("drawing circle...");
    }

    public String getArea() {
    }
}
class Triangle1 extends Shapes1
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
    	Shapes1 s;
    	s=new Rectangles1();
    	s.draw();
    	s=new Circles1();
    	s.draw();
    	s=new Triangle1();
    	s.draw();
    }
}