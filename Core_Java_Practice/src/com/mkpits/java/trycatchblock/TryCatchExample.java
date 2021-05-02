package org.mkpits.java.trycatchblock;
//Let's try to understand the problem if we don't use a try-catch block.


class TryCatchExample {
    public static void main(String[] args) {

        int data=50/0; //may throw exception

        System.out.println("rest of the code");

    }

}