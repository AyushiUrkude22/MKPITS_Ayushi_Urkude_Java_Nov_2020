package src.com.mkpits.java.exceptionpropagation;
//Program of Exception Propagation.

class TestExceptionPropagation{
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String args[]){
        TestExceptionPropagation obj=new TestExceptionPropagation();
        obj.p();
        System.out.println("normal flow...");
    }
}

