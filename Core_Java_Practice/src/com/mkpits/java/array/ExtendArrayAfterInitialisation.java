package src.com.mkpits.java.array;
//Java Program to extend an array after initialization by creating an new array.

public class ExtendArrayAfterInitialisation {
    public static void main(String[] args) {
            String[] names = new String[] { "A", "B", "C" };
            String[] extended = new String[5];
            extended[3] = "D";
            extended[4] = "E";
            System.arraycopy(names, 0, extended, 0, names.length);

            for (String str : extended){
                System.out.println(str);
            }
        }
    }