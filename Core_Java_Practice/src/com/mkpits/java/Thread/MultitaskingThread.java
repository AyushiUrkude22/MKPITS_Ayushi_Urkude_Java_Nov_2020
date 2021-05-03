package src.com.mkpits.java.Thread;
/* If you have to perform single task by many threads, have only one run() method.For example:
Program of performing single task by multiple threads. */

class TestMultitasking1 extends Thread{
    public void run(){
        System.out.println("task one");
    }
    public static void main(String args[]){
        TestMultitasking1 t1=new TestMultitasking1();
        TestMultitasking1 t2=new TestMultitasking1();
        TestMultitasking1 t3=new TestMultitasking1();

        t1.start();
        t2.start();
        t3.start();
    }
}
