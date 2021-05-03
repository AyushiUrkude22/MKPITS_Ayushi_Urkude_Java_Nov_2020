package src.com.mkpits.java.controlflowstatement;
//Using the while statement to print the values from 1 through 10 can be accomplished as in the following WhileDemo program.

class While {
    public static void main(String[] args)
    {
        int count = 1;
        while (count < 11)
        {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}
