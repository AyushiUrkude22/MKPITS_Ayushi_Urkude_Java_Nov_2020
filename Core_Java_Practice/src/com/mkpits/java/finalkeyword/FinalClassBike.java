package org.mkpits.java.finalkeyword;
//If you make any class as final, you cannot extend it.

class FinalClassBike{}

class HondaH extends FinalClassBike{
    void run(){System.out.println("running safely with 100kmph");}

    public static void main(String args[]){
        HondaH honda= new HondaH();
        honda.run();
    }
}
