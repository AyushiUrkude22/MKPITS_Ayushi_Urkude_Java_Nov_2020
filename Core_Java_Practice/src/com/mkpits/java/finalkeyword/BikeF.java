package src.com.mkpits.java.finalkeyword;
/* There is a final variable speedlimit, we are going to change the value of this variable, but It can't be
changed because final variable once assigned a value can never be changed. */

class BikeF{
    final int speedlimit;//final variable

    BikeF()
    {

        speedlimit=20;
    }
    void run(){
//speedlimit=400;
        System.out.println(speedlimit);
    }
    public static void main(String args[])
    {
        BikeF obj=new BikeF();
        obj.run();
    }
}
