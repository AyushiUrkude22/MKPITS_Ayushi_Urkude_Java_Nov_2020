package org.mkpits.java.NestedInterface;
//Example of nested interface which is declared within the class.

 class NestedA{
        interface Message{
            void msg();

        }
    }

    class TestNestedInterface2 implements NestedA.Message{
        public void msg(){System.out.println("Hello nested interface");}

        public static void main(String args[]){
            NestedA.Message message=new TestNestedInterface2();//upcasting here
            message.msg();
        }
    }