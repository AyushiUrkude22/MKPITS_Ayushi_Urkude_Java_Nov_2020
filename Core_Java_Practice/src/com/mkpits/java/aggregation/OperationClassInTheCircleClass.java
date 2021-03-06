package src.com.mkpits.java.aggregation;
//Write a program to created the reference of Operation class in the Circle class.

class Operation{
    int square(int n){
        return n*n;
    }

}

class OperationClassInTheCircleClass{
    Operation op;//aggregation
    double pi=3.14;

    double area(int radius){
        op=new Operation();
        int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).
        return pi*rsquare;
    }

    public static void main(String args[]){
        OperationClassInTheCircleClass c=new OperationClassInTheCircleClass();
        double result=c.area(5);
        System.out.println(result);
    }
}
