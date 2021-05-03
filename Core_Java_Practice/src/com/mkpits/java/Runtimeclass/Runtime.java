package src.com.mkpits.java.Runtimeclass;
/*Program of Runtime you can use -s switch to shutdown system, -r switch to restart system and -t switch to specify time
delay. */

class Runtime2{
    public static void main(String args[])throws Exception{
        Runtime.getRuntime().exec("shutdown -s -t 0");
    }

}
