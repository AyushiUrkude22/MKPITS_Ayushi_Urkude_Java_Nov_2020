package src.com.mkpits.java.exceptionHandling;
/* The "catch" block is used to handle the exception. It must be preceded by try block which
means we can't use catch block alone. It can be followed by finally block later. */

public class CatchSimple{
    public static void main(String args[]){

        int n1=10;
        int n2=0;
        int res=0;
        try
        {
            res=n1/n2;
        }catch(Exception ee)
        {
            System.out.println(ee.toString());
        }
        System.out.println("res = " + res);

    }

}