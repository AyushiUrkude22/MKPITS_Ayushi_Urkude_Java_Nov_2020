package src.com.mkpits.java.overriding;
/* It is because the static method is bound with class whereas instance method is bound with an object
  Static belongs to the class area, and an instance belongs to the heap area */

class Bank4 {
    static int roi=2;
    int getRateOfInterest(){return 0;}
    static void showroi()
    {

        System.out.println("roi from static method : " + roi);
    }
}
//Creating child classes.

class SBI1 extends Bank4
{

    int getRateOfInterest(){
        roi=roi+2;
        return roi;}

}

class ICICI1 extends Bank4{
    int getRateOfInterest(){return 7;}
}
class AXIS1 extends Bank4{
    int getRateOfInterest(){return 9;}
}
//Test class to create objects and call the methods
class Test1
{
    public static void main(String args[]){
        SBI1 s=new SBI1();
        Bank4.showroi();
        ICICI1 i=new ICICI1();
        AXIS1 a=new AXIS1();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest()); //8
// System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest()); //7
// System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest()); //
    }
}
