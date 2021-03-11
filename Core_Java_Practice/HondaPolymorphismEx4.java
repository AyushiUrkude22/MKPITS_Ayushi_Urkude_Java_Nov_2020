//Java program Example of Runtime Polymorphism with Data Member.

class Bike5
{
	int speedlimit=110;
}

class HondaPolymorphism extends Bike5
{
    int speedlimit=150;
    public static void main(String args[])
    {
    	Bike obj=new HondaPolymorphism();
      	System.out.println(obj.speedlimit);//90
    }
}