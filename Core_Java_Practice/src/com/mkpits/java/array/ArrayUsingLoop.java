package src.com.mkpits.java.array;
//Java Program to example of Print all elements of 2d array Using Loop.

class ArrayUsingLoop {
    public static void main(String[] args) {

        int[][] a = {
                {1, -2, 3},
                {4, -5, 6, 9},
                {7},
        };

        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.println(a[i][j]);
            }
        }
    }
}