package org.mkpits.java.Synchronization;
//Example of java synchronized method.

class Table1{
    synchronized void printTable(int n){//synchronized method
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

class MyThreadA extends Thread{
    Table t;
    MyThreadA(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThreadB extends Thread{
    Table t;
    MyThreadB(Table t){
        this.t=t;
    }

    public void run(){
        t.printTable(100);
    }
}

class TestSynchronization2{
    public static void main(String args[]){
        Table obj = new Table();//only one object
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
