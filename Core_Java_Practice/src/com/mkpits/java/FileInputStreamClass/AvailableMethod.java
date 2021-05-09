package src.com.mkpits.java.FileInputStreamClass;
//Java Program to example of To get To get the number of available bytes, we can use the available() method.

import java.io.FileInputStream;
class AvailableMethod {
    public static void main(String args[]) {

            try {
                // Suppose, the input.txt file contains the following text
                // This is a line of text inside the file.
                FileInputStream input = new FileInputStream("input.txt");

                // Returns the number of available bytes
                System.out.println("Available bytes at the beginning: " + input.available());

                // Reads 3 bytes from the file
                input.read();
                input.read();
                input.read();

                // Returns the number of available bytes
                System.out.println("Available bytes at the end: " + input.available());

                input.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
