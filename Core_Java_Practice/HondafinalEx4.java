//Java program Example of Java final class.

final class BikeH{}
class Hondafinale extends BikeH//Compile time error.
{
      void run()
      {
		  System.out.println("running safely with 100kmph");
	  }

      public static void main(String args[])
      {
      		Hondafinal honda= new Hondafinal();
      		honda.run();
      }
}
