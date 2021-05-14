package src.com.mkpits.java.runtimeclass;
//Program of restart system in Java.

class Runtime3{
    public static void main(String args[])throws Exception{
        Runtime.getRuntime().exec("shutdown -r -t 0");
    }
}

