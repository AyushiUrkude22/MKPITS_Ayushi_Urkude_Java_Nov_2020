package src.com.mkpits.java.Anonymousinnerclass;
//Java anonymous inner class example using interface.

interface Eatable{
    void eat();
}
class TestAnnonymousInner1{
    public static void main(String args[]){
        Eatable e=new Eatable(){
            public void eat(){System.out.println("nice fruits");}
        };
        e.eat();
    }
}
