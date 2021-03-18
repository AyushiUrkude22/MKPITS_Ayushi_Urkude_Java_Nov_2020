//Java Program Example of synchronized method by using annonymous class.
//In this program, we have created the two threads by annonymous class,
//so less coding is required.

class TableO {
	synchronized void printTable(int n) {//synchronized method
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

public class SynchronizationEx3 {
    public static void main(String args[]) {
    	final TableO obj = new TableO();//only one object


    	Thread t1=new Thread(){
    		public void run(){
    			obj.printTable(5);
    		}
    	};
    	Thread t2=new Thread(){
    		public void run(){
    			obj.printTable(100);
    		}
    	};

    	t1.start();
    	t2.start();
    }
}