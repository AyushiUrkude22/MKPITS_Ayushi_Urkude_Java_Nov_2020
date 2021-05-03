package src.com.mkpits.java.Interface;
// Java Interface Example: Drawable.

interface shape {
    void draw1();
}

class cir implements shape
{
    public void draw1()
    {
        System.out.println("circle coding");
    }
}

class te
{
    public static void main(String[] arg)
    {
        cir c=new cir();
        c.draw1();
    }
}