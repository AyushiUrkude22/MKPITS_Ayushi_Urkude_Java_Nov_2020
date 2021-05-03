package src.com.mkpits.java.filehandling;
//Java program to Data Stream Example.

import java.io.FileInputStream;
class DataStreamExample2 {
    public static void main(String[] args){
        try{
            FileInputStream fin=new FileInputStream("D:\\testout.txt");
            int i;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
