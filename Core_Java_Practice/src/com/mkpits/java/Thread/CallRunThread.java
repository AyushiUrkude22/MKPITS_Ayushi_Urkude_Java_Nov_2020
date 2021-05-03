package src.com.mkpits.java.Thread;
/* Example of Invoking the run() method from main thread, the run() method goes onto the current call stack rather
than at the beginning of a new call stack. */

class TestCallRun1 extends Thread{
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        TestCallRun1 t1=new TestCallRun1();
        t1.run();//fine, but does not start a separate call stack
    }
}
