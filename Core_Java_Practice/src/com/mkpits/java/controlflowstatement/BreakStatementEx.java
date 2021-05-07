package src.com.mkpits.java.controlflowstatement;
//Java Program to example of break statement.

class BreakStatementEx {
    public static void main(String[] args) {

        // for loop
        for (int i = 1; i <= 10; ++i) {

            // if the value of i is 5 the loop terminates
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}