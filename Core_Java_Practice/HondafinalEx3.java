//Java program Example of Java final method.

class Bike2
{
      final void run()
      {
		  System.out.println("running");
	  }
}

class HondaAbstract extends Bike
{
       void run()
       {
		   System.out.println("running safely with 100kmph");
	   }
       public static void main(String args[])
       {
           HondaAbstract honda= new HondaAbstract();
       		honda.run(); //Compile time error.
       }
}