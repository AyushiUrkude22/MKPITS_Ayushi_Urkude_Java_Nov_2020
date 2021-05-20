package src.com.mkpits.java.garbageCollection;
//Example of garbage collection in java.

import java.io.*;
class gcex {
    public void finalize() {

        System.out.println("finalize method is called");
        try {
            fout.close();
        }catch ( Exception ee) {
        }
    }
    static FileOutputStream fout;
    public static void main(String[] args) {
        try {
            fout = new
                    FileOutputStream("e://ekta//abc.txt");
            fout.write(44);
        }catch ( Exception ee) {
        }
        gcex g1=new gcex();
        g1=null;
        System.gc();
        System.out.println("e1 object will be destroyed by gc");
    }
}