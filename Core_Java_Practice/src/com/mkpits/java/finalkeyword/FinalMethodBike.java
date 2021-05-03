package src.com.mkpits.java.finalkeyword;
//If you make any method as final, you cannot override it.

class FinalMethodBike{
    void run(){System.out.println("running");}
}

class Honda extends FinalMethodBike{

    void run(){System.out.println("running safely with 100kmph");}

    public static void main(String args[]){
        Honda honda= new Honda();
        honda.run();
    }
}
