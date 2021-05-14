package src.com.mkpits.java.javastring;
//String substring(int beginIndex, int endIndex) returns substring for given begin index and end index.

class SubstringOperation{
    public static void main(String args[])
    {
        String s3=new String("example");//creating java string by new keyword
        String ss=s3.substring(2,5);

        System.out.println(ss);

    }
}