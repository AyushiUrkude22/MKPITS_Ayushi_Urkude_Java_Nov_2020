package src.com.mkpits.java.ExceptionHandling;
/* The "finally" block is used to execute the important code of the program. It is executed
whether an exception is handled or not. */

public class FinallySimple{
    public static void main(String args[]){

        int n1=10;
        int n2=5;
        int res=0;
        try
        {
            res=n1/n2;
        }catch(Exception ee)
        {
            System.out.println(ee.toString());
        }
        finally
        {
            System.out.println("finally res = " + res);
        }

    }
}
