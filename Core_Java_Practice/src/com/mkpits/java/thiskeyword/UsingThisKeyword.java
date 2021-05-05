package src.com.mkpits.java.thiskeyword;
//Java Program to example of using this keyword.

class UsingThisKeyword {

    int age;
    UsingThisKeyword(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        UsingThisKeyword obj = new UsingThisKeyword(8);
        System.out.println("obj.age = " + obj.age);
    }
}