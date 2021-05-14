package src.com.mkpits.java.thread;
//Example of interrupting a thread that stops working.

class TestInterruptingThread extends Thread{
    public void run(){
            try{
                Thread.sleep(1000);
                System.out.println("task");
            }catch(InterruptedException e){
                throw new RuntimeException("Thread interrupted..."+e);
            }

        }

        public static void main(String args[]){
            TestInterruptingThread t1=new TestInterruptingThread();
            t1.start();
            try{
                t1.interrupt();
            }catch(Exception e){System.out.println("Exception handled "+e);}

        }
    }
