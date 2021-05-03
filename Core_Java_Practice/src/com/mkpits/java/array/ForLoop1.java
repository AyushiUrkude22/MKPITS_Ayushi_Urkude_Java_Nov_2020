package src.com.mkpits.java.array;
/*Write a program to print output
 *
 * *
 * * *
 */

class ForLoop1 {
    public static void main(String[] arg)
    {
        int rows,cols;
        for(rows=1;rows<=10;rows++)
        {
            for(cols=1;cols<=rows;cols++)

            {
                System.out.print("*" + "\t");

            }
            System.out.println();
        }

    }
}
