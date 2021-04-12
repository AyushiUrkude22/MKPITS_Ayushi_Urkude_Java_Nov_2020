package org.mkpits.java.polymorphism;
/* Consider a scenario where Bank is a class that provides a method to get the rate of interest. However,
the rate of interest may differ according to banks. For example, SBI, ICICI, and AXIS banks are providing
8.4%, 7.3%, and 9.7% rate of interest */

class Bank5{
    float getRateOfInterest(){return 0;}
}
class SBI5 extends Bank5{
    float getRateOfInterest(){return 8.4f;}
}
class ICICI5 extends Bank5{
    float getRateOfInterest(){return 7.3f;}
}
class AXIS5 extends Bank5{
    float getRateOfInterest(){return 9.7f;}
}

class MethodOverridingButThereWasNoUpcasting{
    public static void main(String args[]) {
        Bank5 b;
        b=new SBI5();
        System.out.println("SBI5 Rate of Interest: "+b.getRateOfInterest());
        b=new ICICI5();
        System.out.println("ICICI5 Rate of Interest: "+b.getRateOfInterest());
        b=new AXIS5();
        System.out.println("AXIS5 Rate of Interest: "+b.getRateOfInterest());
    }
}