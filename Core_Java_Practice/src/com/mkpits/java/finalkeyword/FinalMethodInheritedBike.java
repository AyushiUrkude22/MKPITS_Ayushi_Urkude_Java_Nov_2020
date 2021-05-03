package src.com.mkpits.java.finalkeyword;
//final method is inherited but you cannot override it.

class FinalMethodInheritedBike{
    final void run(){System.out.println("running...");}
}
class Honda2 extends FinalMethodInheritedBike{
    public static void main(String args[]){
        new Honda2().run();
    }
}
