package src.com.mkpits.java.javastring;
/* No. Method Description
1 char charAt(int index) returns char value for the particular index
2 int length() returns string length */

class MethodDescriptionOperation{

    public static void main(String args[])
    {
        String s3=new String("example");//creating java string by new keyword
        int c=s3.length();
        for(int i=0;i<c;i++)
        {
            System.out.println(s3.charAt(i));
        }
    }
}
