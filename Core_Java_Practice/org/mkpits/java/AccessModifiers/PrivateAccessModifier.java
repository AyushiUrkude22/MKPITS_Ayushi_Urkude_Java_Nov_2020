package org.mkpits.java.AccessModifiers;
/* In this example, we have created two classes A and Simple. A class contains private data member and
private method. We are accessing these private members from outside the class, so there is a compile-
time error. */


class Ab{
    private int data=40;
    private void msg(){System.out.println("Hello java");}
}

class Simple1{
    public static void main(String args[]){
        Ab obj=new Ab();
        System.out.println(obj.data);//Compile Time Error
        obj.msg();//Compile Time Error
    }
}
