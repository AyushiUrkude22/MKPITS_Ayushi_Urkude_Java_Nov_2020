package src.com.mkpits.java.runtimeclass;
//Program of shutdown windows system in Java.

class ShutdownWindowsSystem {
    public static void main(String args[])throws Exception{
        Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
    }
}
