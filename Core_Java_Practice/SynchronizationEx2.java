//Java program example of synchronized method.
//When a thread invokes a synchronized method,
//it automatically acquires the lock for that object and
//releases it when the thread completes its task.

class Table2 {
	synchronized void printTable2(int n) {//synchronized method
       for(int i=1;i<=5;i++) {
         System.out.println(n + " * " + i + " = " + n*i);
         try {
			 Thread.sleep(400);
         }catch(Exception e) {
			 System.out.println(e);
		 }
      }
   }
}

class MyThread11 extends Thread {
    Table2 t;
    MyThread11(Table2 t) {
    	this.t=t;
    }
    public void run() {
    	t.printTable(5);
    }
}

class MyThread12 extends Thread {
    Table2 t;
    MyThread12(Table2 t) {
    	this.t=t;
    }
    public void run() {
    	t.printTable(100);
    }
}

public class SynchronizationEx2 {
    public static void main(String args[]) {
    	Table2 obj = new Table2();//only one object
    	MyThread1 t1=new MyThread1(obj);
    	MyThread2 t2=new MyThread2(obj);
    	t1.start();
    	t2.start();
    }
}
