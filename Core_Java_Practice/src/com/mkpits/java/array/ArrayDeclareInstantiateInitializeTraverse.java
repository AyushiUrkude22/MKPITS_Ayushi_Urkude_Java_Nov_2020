package src.com.mkpits.java.array;
//Java Program to illustrate how to declare, instantiate, initialize and traverse the Java array.

class ArrayDeclareInstantiateInitializeTraverse{
        public static void main(String args[]){
            int a[]=new int[5];//declaration and instantiation
            a[0]=100;//initialization
            a[1]=200;
            a[2]=700;
            a[3]=400;
            a[4]=500;
//traversing array
            for(int i=0;i<a.length;i++)//length is the property of array
                System.out.println(a[i]);
        }
}
