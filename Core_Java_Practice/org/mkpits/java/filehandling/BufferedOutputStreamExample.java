package org.mkpits.java.filehandling;
//Example of BufferedOutputStream class.
//Java Program to Buffered Output Stream Example.

import java.io.*;
class BufferedOutputStreamExample{
    public static void main(String[] args)throws Exception{

        org.mkpits.java.filehandling.FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Welcome to mkpits.";
        byte[] b =s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}
