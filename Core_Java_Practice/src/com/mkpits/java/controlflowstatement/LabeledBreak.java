package src.com.mkpits.java.controlflowstatement;
/*Java Program to example of if we change the statement break first; to break second;
the program will behave differently. In this case, for loop labeled as second will be terminated. */

class LabeledBreak {
    public static void main(String[] args) {

        // the for loop is labeled as first
        first:
        for( int i = 1; i < 5; i++) {

            // the for loop is labeled as second
            second:
            for(int j = 1; j < 3; j ++ ) {

                System.out.println("i = " + i + "; j = " +j);

                // the break statement terminates the loop labeled as second
                if ( i == 2)
                    break second;
            }
        }
    }
}
