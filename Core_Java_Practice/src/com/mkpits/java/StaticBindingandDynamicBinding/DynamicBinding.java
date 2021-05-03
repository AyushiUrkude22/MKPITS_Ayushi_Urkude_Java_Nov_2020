package src.com.mkpits.java.StaticBindingandDynamicBinding;
// Java program Example of dynamic binding.

class DynamicBinding{
    void eat(){System.out.println("animal is eating...");}
}

class DogA extends DynamicBinding{
    void eat(){System.out.println("dog is eating...");}

    public static void main(String args[]){

        DynamicBinding a=new DogA();
        a.eat();
    }
}
