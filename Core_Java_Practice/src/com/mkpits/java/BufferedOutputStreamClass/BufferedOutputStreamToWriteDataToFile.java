package src.com.mkpits.java.BufferedOutputStreamClass;
//Java Program to example to BufferedOutputStream to write data to a File.

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class BufferedOutputStreamToWriteDataToFile {
    public static void main(String[] args) {

        String data = "This is a line of text inside the file";

        try {
            // Creates a FileOutputStream
            FileOutputStream file = new FileOutputStream("output.txt");

            // Creates a BufferedOutputStream
            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();

            // Writes data to the output stream
            output.write(array);
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}