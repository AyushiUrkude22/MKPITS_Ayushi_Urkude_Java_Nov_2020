package src.com.mkpits.java.FileOutputStream;
/*Java Program to example of To clear the output stream, we can use the flush() method.
This method forces the output stream to write all data to the destination. */

import java.io.FileOutputStream;
import java.io.IOException;
class FlushMethod {
    public static void main(String[] args) throws IOException {

        FileOutputStream out = null;
        String data = "This is demo of flush method";

        try {
            out = new FileOutputStream(" flush.txt");

            // Using write() method
            out.write(data.getBytes());

            // Using the flush() method
            out.flush();
            out.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}