package src.com.mkpits.java.array;
//Java Program to example of arrays expansion.

public class ArraysExpansion {
    public void extendArraySize() {
        String[] names = new String[] {"Ayushi", "Kalash", "Palak"};
        String[] extended = new String[5];
        extended[3] = "Akshay";
        extended[4] = "Ayu";
        System.arraycopy(names, 0, extended, 0, names.length);

        for (String str : extended) System.out.println(str);
    }
    public static void main(String[] args) {
        new ArraysExpansion().extendArraySize();
    }
}