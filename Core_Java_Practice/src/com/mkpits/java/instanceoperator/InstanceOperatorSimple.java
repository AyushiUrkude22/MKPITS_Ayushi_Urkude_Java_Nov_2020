package src.com.mkpits.java.instanceoperator;
//See the simple example of instance operator where it tests the current class.

class InstanceOperatorSimple{
    public static void main(String args[]){
        InstanceOperatorSimple s=new InstanceOperatorSimple();
        System.out.println(s instanceof InstanceOperatorSimple);//true
    }
}
