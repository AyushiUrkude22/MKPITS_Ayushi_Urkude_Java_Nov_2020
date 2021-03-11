//Java Program of instance initializer block that is invoked after super()
class Ayushi
{
    Ayushi ()
    {
    	System.out.println("parent class constructor invoked");
    }
}

class B_InstanceInitializer extends Ayushi
{
    B_InstanceInitializer()
    {
    	super();
    	System.out.println("child class constructor invoked");
    }

    {
		System.out.println("instance initializer block is invoked");
	}

    public static void main(String args[])
    {
    	B_InstanceInitializer b=new B_InstanceInitializer();
    }
}



