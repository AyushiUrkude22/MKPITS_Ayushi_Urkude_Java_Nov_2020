package src.com.mkpits.java.thiskeyword;
//Java Program to example of java this Keyword.

class ThisKeyword {
    int instVar;

    ThisKeyword(int instVar){
        this.instVar = instVar;
        System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(8);
        System.out.println("object reference = " + obj);
    }
}