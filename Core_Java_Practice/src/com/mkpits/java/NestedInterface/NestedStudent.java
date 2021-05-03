package src.com.mkpits.java.NestedInterface;
// Java Program of Nested Interface.


class NestedStudent
    {

        interface instudent
        {
            void msg();
        }
        interface instudent1
        {
            void msg1();

        }
    }

    class testinner implements NestedStudent.instudent,NestedStudent.instudent1
    {
        public void msg()
        {
            System.out.println("hello from msg");
        }
        public void msg1()

        {
            System.out.println("hello from msg1");
        }
        public static void main(String[] arg)
        {
            NestedStudent.instudent ss=new testinner();
            ss.msg();
            NestedStudent.instudent1 ss1=new testinner();
            ss1.msg1();

        }
    }