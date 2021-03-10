//Java Program of performing single task by multiple threads.

class SingleTaskByMultipleThreads implements Runnable {
    public void run() {
    	System.out.println("task one");
    }

    public static void main(String args[]) {
    	Thread t1 =new Thread(new SingleTaskByMultipleThreads());//passing annonymous object of TestMultitasking2 class
    	Thread t2 =new Thread(new SingleTaskByMultipleThreads());

    	t1.start();
    	t2.start();
    }
}