package src.com.mkpits.java.SynchronizedBlock;
//Program of synchronized block.

class SynchronizedBlockTable{

        void printTable(int n){
            synchronized(this){//synchronized block
                for(int i=1;i<=5;i++){
                    System.out.println(n*i);
                    try{
                        Thread.sleep(400);
                    }catch(Exception e){System.out.println(e);}
                }
            }

        }//end of the method
    }

    class MyThread1 extends Thread{ SynchronizedBlockTable t;
        MyThread1(SynchronizedBlockTable t){
            this.t=t;
        }
        public void run(){
            t.printTable(5);
        }

    }
    class MyThread2 extends Thread{
        SynchronizedBlockTable t;
        MyThread2(SynchronizedBlockTable t){
            this.t=t;
        }
        public void run(){
            t.printTable(100);
        }
    }

    class TestSynchronizedBlock1{
        public static void main(String args[]){
            SynchronizedBlockTable obj = new SynchronizedBlockTable();//only one object
            MyThread1 t1=new MyThread1(obj);
            MyThread2 t2=new MyThread2(obj);
            t1.start();
            t2.start();
        }
    }