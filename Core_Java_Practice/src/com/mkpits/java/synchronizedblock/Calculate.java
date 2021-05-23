package src.com.mkpits.java.synchronizedblock;
//Example of synchronized block.

class calculate {
    public void addition( int n1, int n2) {
        synchronized (this) {
            for (int i = 1; i <= 3; i++) {
                int res = n1 + n2;
                System.out.println(Thread.currentThread().getName()

                        +" add : " + res);
                try {
                    Thread.sleep(1000);
                } catch (Exception ee) {
                }
            }
        }
    }

}
class sbex {
    public static void main(String[] args) {
        calculate cal=new calculate();
        Thread t1=new Thread() {
            public void run() {
                cal.addition(2,3);
            }
        };
        Thread t2=new Thread() {
            public void run() {
                cal.addition(21,3);
            }
        };
        t1.start();
        t2.start();
    }
}