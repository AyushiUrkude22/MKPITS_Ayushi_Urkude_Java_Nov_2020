package src.com.mkpits.java.memberinnerclass;
/* Java Member inner class example
In this example, we are creating msg() method in member inner class that is accessing the private data
member of outer class. */

class TestMemberOuter1{
    private int data=30;
    class Inner{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        TestMemberOuter1 obj=new TestMemberOuter1();
        TestMemberOuter1.Inner in=obj.new Inner();
        in.msg();
    }
}
