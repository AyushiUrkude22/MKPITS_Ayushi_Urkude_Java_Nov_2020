package src.com.mkpits.java.thiskeyword;
//Write a program to this keyword that you return as a statement from the method.

class D{
    D getD()
    {
        return this;
    }
    void msg(){System.out.println("Hello java");}
}

class ReturnCurrentClassInstance
{
    public static void main(String args[])
    {
        new D().getD().msg();
    }
}
