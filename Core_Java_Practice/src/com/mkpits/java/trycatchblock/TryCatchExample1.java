package src.com.mkpits.java.trycatchblock;
/* There can be 100 lines of code after exception. So all the code after exception will not be executed.
Solution by exception handling
Let's see the solution of the above problem by a java try-catch block. */

public class TryCatchExample1 {

    public static void main(String[] args) {
        try
        {
            int data=50/0; //may throw exception
        }
//handling the exception
        catch(ArithmeticException e)
        {

            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}
