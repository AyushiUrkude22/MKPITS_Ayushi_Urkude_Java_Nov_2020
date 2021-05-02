package org.mkpits.java.Thread;
/* If you are not extending the Thread class,your class object would not be treated as a thread object.So
you need to explicitely create Thread class object.We are passing the object of your class that
implements Runnable so that your class run() method may execute. */

class ThreadEx11 implements Runnable {
    public void run() {
        for(int i=1;i<25;i++) {
            System.out.println("my thread is running " + i);
        }
    }

    public static void main(String[] arg) {
        ThreadEx11 th=new ThreadEx11();
        Thread t=new Thread(th);
        t.start();
        Thread t1=new Thread(th);
        t1.start();
    }
}
