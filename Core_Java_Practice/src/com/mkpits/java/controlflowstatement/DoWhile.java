package src.com.mkpits.java.controlflowstatement;
//The difference between do-while and while is that do-while evaluates its expression at the bottom of the loop instead of the top.

class DoWhile {
    public static void main(String[] args)
    {
        int count = 1;
        do
            {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);

    }
}
