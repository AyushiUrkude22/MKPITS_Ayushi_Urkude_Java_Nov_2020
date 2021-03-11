//Java program Example of Java final class.

final class Bike3{}

class HondafinalE extends Bike3	//Compile time error.
{
      void run()
      {
		  System.out.println("running safely with 100kmph");
	  }

      public static void main(String args[])
      {
      		HondafinalE honda= new HondafinalE();
      		honda.run();
      }
}