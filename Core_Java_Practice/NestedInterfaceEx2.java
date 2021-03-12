//Java program Example of nested interface which is declared within the class.

class Abcd
{
      interface Message
      {
       void msg();
      }
}

class NestedInterfaceEx2 implements Abcd
{
     public void msg()
     {
		 System.out.println("Hello nested interface");
     }
     public static void main(String args[])
     {
     	 A.Message message=new NestedInterfaceEx2();//upcasting here
     	 message.msg();
     }
}