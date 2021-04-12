//Java program Example of Java final method.

class Bike7
{
      final void run()
      {
		  System.out.println("running");
	  }
}

class HondaAbstract extends Bike7
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