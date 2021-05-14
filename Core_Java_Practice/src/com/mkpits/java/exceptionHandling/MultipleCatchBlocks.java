package src.com.mkpits.java.exceptionHandling;
//Java Program to example of Multiple Catch blocks.

class MultipleCatchBlocks {
    public int[] arr = new int[10];

    public void writeList() {

        try {
            arr[10] = 11;
        }

        catch (NumberFormatException e1) {
            System.out.println("NumberFormatException => " + e1.getMessage());
        }

        catch (IndexOutOfBoundsException e2) {
            System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
        }

    }
}

class Main {
    public static void main(String[] args) {
        MultipleCatchBlocks list = new MultipleCatchBlocks();
        list.writeList();
    }
}