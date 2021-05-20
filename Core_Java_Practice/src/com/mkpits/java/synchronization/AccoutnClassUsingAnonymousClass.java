package src.com.mkpits.java.synchronization;
//Java example of accoutn class using anonymous class.

import java.util.*;
//shared resource
class account1 {
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

class Sync2ex1 {
    public static void main(String[] args) {
        account act=new account();
        Thread t1=new Thread() {
            public void run() {
                act.deposit();
                try {
                    Thread.sleep(1000);
                } catch (Exception ee) {
                }
            }
        };
        t1.start();
        Thread t2=new Thread() {
            public void run() {
                act.deposit();
                try {
                    Thread.sleep(1000);
                } catch (Exception ee) {
                }
            }
        };
        t2.start();

    }
}