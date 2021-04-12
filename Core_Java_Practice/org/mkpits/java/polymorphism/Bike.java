package org.mkpits.java.polymorphism;
/* Both the classes have a data member speedlimit. We are accessing the
data member by the reference variable of Parent class which refers to the subclass object. Since we are
accessing the data member which is not overridden, hence it will access the data member of the Parent
class always */

class BikeA{
    int speedlimit=90;
}

class Honda3 extends BikeA {
    int speedlimit = 150;

    public static void main(String args[]) {
        Bike obj = new Honda3();
        System.out.println(obj.speedlimit);//90

    }
}
