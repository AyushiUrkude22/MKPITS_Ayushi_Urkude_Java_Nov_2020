package src.com.mkpits.java.Thread;
//Example of priority of a Thread.

class thpr extends Thread {
    public void run() {
        System.out.println("current thread name " + Thread.currentThread().getName());
        System.out.println("current thread priority " + Thread.currentThread().getPriority());
    }

    public static void main(String[] arg) {
        thpr t1=new thpr();
        thpr t2=new thpr();
        thpr t3=new thpr();

        t1.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
