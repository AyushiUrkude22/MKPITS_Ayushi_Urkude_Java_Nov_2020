package src.com.mkpits.java.exceptionHandlingwithMethodOverriding;
// Example in case subclass overridden method declares parent exception.

class SubclassOverriddenMethodDeclaresParentException{
    void msg()throws ArithmeticException, Exception {System.out.println("parent");}
}

class TestExceptionChild2 extends SubclassOverriddenMethodDeclaresParentException{
    private static Object SubclassOverriddenMethodDeclaresParentException;

    void msg()throws Exception{System.out.println("child");}

    public static void main(String args[]){
        SubclassOverriddenMethodDeclaresParentException =new TestExceptionChild2();
        try{

            ExceptionParent p = null;
            p.msg();
        }catch(Exception e){}
    }
}