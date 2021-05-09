package src.com.mkpits.java.aggregation;
//Java In this example, we have created the reference of Operation class in the Circle class.

class OperationA{
    int square(int n){
        return n*n;
    }
}

class Circle{
    OperationA op;//aggregation
    double pi=3.14;

    double area(int radius){
        op=new OperationA();
        int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).
        return pi*rsquare;
    }



    public static void main(String args[]){
        Circle c=new Circle();
        double result=c.area(5);
        System.out.println(result);
    }
}
