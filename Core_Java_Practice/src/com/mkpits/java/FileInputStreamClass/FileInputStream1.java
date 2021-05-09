package src.com.mkpits.java.FileInputStreamClass;
//Java Program to example of try to read this file using FileInputStream.

import java.io.FileInputStream;
class Main1 {

    public static void main(String args[]) {

        try {
            FileInputStream input = new FileInputStream("input.txt");

            System.out.println("Data in the file: ");

            // Reads the first byte
            int i = input.read();

            while(i != -1) {
                System.out.print((char)i);

                // Reads next byte from the file
                i = input.read();
            }
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
