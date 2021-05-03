package src.com.mkpits.java.array;
/*Write a program to print output
1 2 3
1 2 3
1 2 3
rows =3
cols =3
outer loop for rows
and inner loop for columns*/

class NestedForLoop {
    public static void main(String[] arg)
    {
        int rows,cols;
        for(rows=1;rows<=3;rows++)
        {
            for(cols=1;cols<=3;cols++)
            {
                System.out.print(cols + "\t");
            }
            System.out.println();
        }

    }
}
