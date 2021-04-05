package org.mkpits.java.controlflowstatement;
//The break statement You can also use an  break to terminate a for, while, or do-while loop, as shown in the following Break program.

class BreakStatement {
    public static void main(String[] args)
    {
        int[] arrayOfInts =
                { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++)
        {
            if (arrayOfInts[i] == searchfor)
            {
                foundIt = true;
                break;
            }
        }

        if (foundIt)
        {

            System.out.println("Found " + searchfor + " at index " + i);
        } else
            {
            System.out.println(searchfor + " not in the array");
        }
    }
}