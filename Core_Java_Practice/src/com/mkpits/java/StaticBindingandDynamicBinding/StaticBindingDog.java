package org.mkpits.java.StaticBindingandDynamicBinding;
//Java program Example of Static Binding.

class StaticBindingDog{
    private void eat(){System.out.println("dog is eating...");}

    public static void main(String args[]){
        StaticBindingDog d1= new StaticBindingDog();
        d1.eat();
    }
}
