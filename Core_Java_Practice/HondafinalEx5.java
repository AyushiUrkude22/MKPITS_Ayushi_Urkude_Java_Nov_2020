//Java program Example of Java final method.
//final method is inherited but you cannot override it.

class Bike4
{
      final void run()
      {
		  System.out.println("running...");
	  }
}

class HondafinalEx extends Bike4
{
       public static void main(String args[])
       {
       		 new HondafinalEx().run();
       }
}