package src.com.mkpits.java.callbyvalueinjava;
// In case of call by value original value is not changed. Let's take a simple example.

class CallByValueInJavaOperation{
    int data=50;

    void change(int data){
        data=data+100;//changes will be in the local variable only
    }

    public static void main(String args[]){
        CallByValueInJavaOperation op=new CallByValueInJavaOperation();

        System.out.println("before change "+op.data);
        op.change(500);
        System.out.println("after change "+op.data);

    }
}