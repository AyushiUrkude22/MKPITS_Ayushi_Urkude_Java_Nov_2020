package src.com.mkpits.java.JavaString;
//Boolean contains(CharSequence s) returns true or false after matching the sequence of char value.

import java.util.*;
class BooleanContainsOperation{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter email address");
        String s3=scan.next();
        boolean ss=s3.contains(".com");
        if(ss==true)
        {

            System.out.println("valid email address");
        }
        else
        {
            System.out.println("invalid email address");
        }

    }
}
