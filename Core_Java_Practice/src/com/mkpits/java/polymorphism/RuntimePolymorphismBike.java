package src.com.mkpits.java.polymorphism;
/*In this example, we are creating two classes Bike and Splendor. Splendor class extends Bike class and
overrides its run() method. We are calling the run method by the reference variable of Parent class.
Since it refers to the subclass object and subclass method overrides the Parent class method, the
subclass method is invoked at runtime.*/

class RuntimePolymorphismBike{
    void run(){System.out.println("running");}
}
class Splendor extends RuntimePolymorphismBike{
    void run(){System.out.println("running safely with 60km");}

    public static void main(String args[]){
        RuntimePolymorphismBike b = new Splendor();//upcasting
        b.run();
    }
}