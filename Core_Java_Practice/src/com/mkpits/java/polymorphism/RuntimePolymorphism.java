package src.com.mkpits.java.polymorphism;
/* In this process, an overridden method is called through the reference variable of a superclass
The determination of the method to be called is based on the object being referred to by the reference variable */

class BankA{

    int getRateOfInterest(){return 0;}

}
//Creating child classes.
class SBI2 extends BankA
{
    int getRateOfInterest(){ return 6;}

}

class ICICI2 extends BankA{
    int getRateOfInterest(){return 7;}

}
class AXIS2 extends BankA{
    int getRateOfInterest(){return 8;}
}
//Test class to create objects and call the methods

class RuntimePolymorphism {
    public static void main(String args[]){
        BankA b=null;
        java.util.Scanner scan=new java.util.Scanner(System.in);
        System.out.println("enter bankA name");
        String bn=scan.next();
        if(bn.equals("SBI2"))
            b=new SBI2();
        else if(bn.equals("ICICI2"))
            b=new ICICI2();
        else if(bn.equals("AXIS2"))
            b=new AXIS2();

        System.out.println("SBI2 Rate of Interest: "+b.getRateOfInterest()); //8

    }
}