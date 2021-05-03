package src.com.mkpits.java.ExceptionHandlingwithMethodOverriding;
/* If the superclass method does not declare an exception, subclass overridden method cannot
declare the checked exception but can declare unchecked exception. */


class UncheckedExceptionParent{
        void msg(){System.out.println("parent");}
    }

    class TestExceptionChild1 extends UncheckedExceptionParent{
        void msg()throws ArithmeticException{
            System.out.println("child");
        }
        public static void main(String args[]){
            UncheckedExceptionParent p=new TestExceptionChild1();
            p.msg();
        }
    }