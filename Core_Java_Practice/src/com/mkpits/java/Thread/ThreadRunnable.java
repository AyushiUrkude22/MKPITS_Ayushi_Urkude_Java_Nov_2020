package src.com.mkpits.java.Thread;
//Java Thread Example by implementing Runnable interface.

class Multi3 implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        Multi3 m1=new Multi3();
        Thread t1 =new Thread(m1);
        t1.start();
    }
}