package src.com.mkpits.java.thiskeyword;
//Java Program to example of without using this keyword.

class WithoutUsingThisKeyword {

    int age;
    WithoutUsingThisKeyword(int age){
        age = age;
    }

    public static void main(String[] args) {
        WithoutUsingThisKeyword obj = new WithoutUsingThisKeyword(8);
        System.out.println("obj.age = " + obj.age);
    }
}