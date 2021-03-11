//Java program Example for Downcasting without the use of java instanceof operator.
class InstanceOfOperator { }

class DogDowncastingP1 extends InstanceOfOperator
{
      static void method(Animal a)
      {
           DogDowncastingP1 d=(DogDowncastingP1)a;//downcasting
           System.out.println("ok downcasting performed");
      }
      public static void main (String [] args)
      {
      	  Animal a=new DogDowncastingP1();
      	  DogDowncastingP1.method(a);
      }
}