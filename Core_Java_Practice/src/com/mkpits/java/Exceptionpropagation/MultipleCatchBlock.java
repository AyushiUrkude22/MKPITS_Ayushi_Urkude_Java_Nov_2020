package src.com.mkpits.java.Exceptionpropagation;
//Program of Multiple Catch Block.

public class MultipleCatchBlock {

    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){

        n();

    }
    public static void main(String args[]){
        MultipleCatchBlock obj=new MultipleCatchBlock();
        try
        {
            obj.p();
        }catch(Exception e){System.out.println("exception handled");}
        System.out.println("normal flow...");
    }

}

