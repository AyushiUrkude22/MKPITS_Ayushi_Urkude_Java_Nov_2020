package org.mkpits.java.filehandling;
//Java FileOutputStream example 2: write string.

class FileOutputStreamExample {
    public FileOutputStreamExample() {
    }

    public static void main(String[] args) {
         try {
             FileOutputStreamExample fout = new FileOutputStreamExample();
             //converting string into byte array
             fout.write();
             fout.close();
             System.out.println("success...");
         } catch (Exception e) {
             System.out.println();
         }
     }

    private void write() {
    }

    private void close() {
    }
}