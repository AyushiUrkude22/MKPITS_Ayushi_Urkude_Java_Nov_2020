package org.mkpits.java.BufferedOutputStreamClass;
//Example of BufferedOutputStream class.

import java.io.*;
class BufferedOutputStreamExample{
    public static void main(String args[])throws Exception{

        FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Welcome to mkpits.";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}
