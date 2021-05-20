package src.com.mkpits.java.synchronization;
//Java example account class.

import java.util.*;
//shared resource
class account {
    int bal=1000;
    synchronized void deposit() {
        for(int i=1;i<=3;i++) {
            System.out.println(Thread.currentThread().getName());
            Scanner s=new Scanner(System.in);
            System.out.println("enter amount to be deposited");
            int amt=s.nextInt();
            bal=bal +amt;
            System.out.println( "amount deposited, bal is " +bal);
        }
    }
}
//creating thread1 class
class accountthread1 extends Thread {
    account act;
    public accountthread1(account act) {
        this.act=act;
    }
    public void run() {
        act.deposit();
        try {
            Thread.sleep(1000);
        } catch (Exception ee) {
        }
    }
}
//creating thread 2 class
class accountthread2 extends Thread {
    account act;
    public accountthread2(account act) {
        this.act=act;
    }
    public void run() {
        act.deposit();
        try {
            Thread.sleep(1000);
        }catch (Exception ee) {
        }

    }
}
class Sync2ex {
    public static void main(String[] args) {
        account a1=new account();
        accountthread1 t1=new accountthread1(a1);
        t1.start();
        accountthread2 t2=new accountthread2(a1);
        t2.start();
    }
}