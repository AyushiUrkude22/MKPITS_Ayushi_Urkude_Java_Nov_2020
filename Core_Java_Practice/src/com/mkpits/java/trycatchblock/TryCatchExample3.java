package org.mkpits.java.trycatchblock;
/* Here, we can see that if an exception occurs in the try block, the rest of the block code will not execute.
Here, we handle the exception using the parent class exception. */

public class TryCatchExample3 {

    public static void main(String[] args) {
        try
        {
            int data=50/0; //may throw exception
        }
// handling the exception by using Exception class
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}
