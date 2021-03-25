package org.mkpits.java.thiskeyword;
/*The this() constructor call can be used to invoke the current class constructor. It is used to reuse the
constructor.In other words, it is used for constructor chaining */


class B{
    B(){System.out.println("hello palak");}
    B(int x){
        this();
        System.out.println(x);
    }
}
class InvokeCurrentClassConstructor
{
    public static void main(String args[])
    {
        B palak=new B(10);
    }
}

