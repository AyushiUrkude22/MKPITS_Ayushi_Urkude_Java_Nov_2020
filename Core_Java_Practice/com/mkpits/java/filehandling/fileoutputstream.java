package com.mkpits.java.filehandling;//Java FileOutputStream Example 1: write byte.

import java.io.OutputStream;

class FileOutputStream extends OutputStream {
        public FileOutputStream(String s) {
        }

        public static void main(String[] args) {
            try {
                FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
                fout.write();
                fout.close();
                System.out.println("success...");
            } catch (Exception e) {
                System.out.println();
            }
        }

    @Override
    public void write(int b) {

    }

    public void close() {
    }

    private void write() {
    }
}



