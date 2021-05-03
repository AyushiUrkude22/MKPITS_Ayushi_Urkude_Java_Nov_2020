package src.com.mkpits.java.array;
/*Write a program to print output
1
1 2
1 2 3*/

public class ForLoop2 {
    public static void main(String[] arg)
    {
        int rows,cols;
        for(rows=1;rows<=3;rows++)
        {
            for(cols=1;cols<=rows;cols++)
            {
                System.out.print(cols + "\t");
            }
            System.out.println();
        }
    }
}
