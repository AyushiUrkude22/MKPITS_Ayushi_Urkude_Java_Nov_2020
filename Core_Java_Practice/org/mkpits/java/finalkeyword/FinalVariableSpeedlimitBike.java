package org.mkpits.java.finalkeyword;
/*There is a final variable speedlimit, we are going to change the value of this variable, but It can't be
changed because final variable once assigned a value can never be changed */

class FinalVariableSpeedlimitBike {
    final int speedlimit=90;//final variable
    void run(){
        speedlimit=400;
    }
    public static void main(String args[]){
        Bike obj=new Bike();
        obj.run();
    }
}//end of class