package src.com.mkpits.java.instanceInitializerBlock;
//initializer block that performs initialization.

class InstanceInitializerBlockBike{
    int speed;

    InstanceInitializerBlockBike(){System.out.println("speed is "+speed);}

    {speed=100;}

    public static void main(String args[]){
        InstanceInitializerBlockBike b1=new InstanceInitializerBlockBike();
        InstanceInitializerBlockBike b2=new InstanceInitializerBlockBike();
    }
}
