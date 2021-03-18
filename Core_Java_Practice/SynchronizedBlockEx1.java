//Java Program Example of synchronized block.

class TableL {
	void printTableL(int n) {
       synchronized(this) {//synchronized block
       	  for(int i=1;i<=5;i++) {
          	System.out.println(n + " * " + i + " = " + n*i);
          	try {
           		Thread.sleep(400);
          	}catch(Exception e) {
				System.out.println(e);
			}
          }
       }//end of synchronized block
    }//end of the method
}

class MyThread13 extends Thread {
    Table t;
    MyThread13(TableL t) {
    	this.t=t;
    }
    public void run() {
    	t.printTableL(5);
    }
}

class MyThread14 extends Thread {
    Table t;
    MyThread14(TableL t) {
    	this.t=t;
    }
    public void run() {
    	t.printTableL(100);
    }
}

public class SynchronizedBlockEx1 {
    public static void main(String args[]) {
    	Table obj = new Table();//only one object
    	MyThread1 t1=new MyThread1(obj);
    	MyThread2 t2=new MyThread2(obj);
    	t1.start();
    	t2.start();
    }
}
