package src.com.mkpits.java.ExceptionHandlingwithMethodOverriding;
// Example in case subclass overridden method declares subclass exception.

class Parent1{

        void msg()throws Exception{System.out.println("parent");}
    }

    class TestExceptionChild4 extends Parent1{
        void msg()throws ArithmeticException{System.out.println("child");}

        public static void main(String args[]){
            Parent p= new Parent();
            try{
                p.msg();
            }catch(Exception e){}
        }
    }