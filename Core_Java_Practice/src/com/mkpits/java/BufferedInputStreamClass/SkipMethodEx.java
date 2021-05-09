package src.com.mkpits.java.BufferedInputStreamClass;
//Java Program to example to discard and skip the specified number of bytes, we can use the skip() method.

import java.io.FileInputStream;
import java.io.BufferedInputStream;
public class SkipMethodEx {

    public static void main(String args[]) {

        try {
            // Suppose, the input.txt file contains the following text
            // This is a line of text inside the file.
            FileInputStream file = new FileInputStream("input.txt");

            // Creates a BufferedInputStream
            BufferedInputStream buffer = new BufferedInputStream(file);

            // Skips the 5 bytes
            buffer.skip(5);
            System.out.println("Input stream after skipping 5 bytes:");

            // Reads the first byte from input stream
            int i = buffer.read();
            while (i != -1) {
                System.out.print((char) i);

                // Reads next byte from the input stream
                i = buffer.read();
            }

            // Closes the input stream
            buffer.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}