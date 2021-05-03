package src.com.mkpits.java.anonymousinnerclass;
// Java anonymous inner class example using class.

abstract class AnonymousInnerClassPerson{
    abstract void eat();
}
class TestAnonymousInner{
    public static void main(String args[]){
        AnonymousInnerClassPerson p=new AnonymousInnerClassPerson(){
            void eat(){System.out.println("nice fruits");}
        };
        p.eat();
    }
}