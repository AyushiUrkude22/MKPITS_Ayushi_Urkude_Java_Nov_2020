package src.com.mkpits.java.instanceoperator;
/*If we apply instanceof operator with a variable that have null value, it returns false. Let's see the example
given below where we apply instanceof operator with the variable that have null value. */

class NullValueDog{
    public static void main(String args[]){
        NullValueDog d=null;
        System.out.println(d instanceof NullValueDog);//false
    }
}
