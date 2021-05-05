package src.com.mkpits.java.thiskeyword;
//Java Program to example of use of this use this keyword to pass the current object as an argument to a method.

class PassingThisAsAnArgument {
    // declare variables
    int x;
    int y;

    PassingThisAsAnArgument(int x, int y) {
        // assign values of variables inside constructor
        this.x = x;
        this.y = y;

        // value of x and y before calling add()
        System.out.println("Before passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);

        // call the add() method passing this as argument
        add(this);

        // value of x and y after calling add()
        System.out.println("After passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);
    }

    void add(PassingThisAsAnArgument o){
        o.x += 2;
        o.y += 2;
    }
}

class Main {
    public static void main( String[] args ) {
        PassingThisAsAnArgument obj = new PassingThisAsAnArgument(1, -2);
    }
}