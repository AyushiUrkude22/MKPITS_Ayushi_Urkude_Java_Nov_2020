package src.com.mkpits.java.FileOutputStream;
//Java Program to example of FileOutputStream to write data to a File.

import java.io.FileOutputStream;
class FileOutputStreamToWriteDataToFile {
    public static void main(String[] args) {

        String data = "This is a line of text inside the file.";

        try {
            FileOutputStream output = new FileOutputStream("output.txt");

            byte[] array = data.getBytes();

            // Writes byte to the file
            output.write(array);

            output.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}