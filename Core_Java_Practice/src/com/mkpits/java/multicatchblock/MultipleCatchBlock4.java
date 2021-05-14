package src.com.mkpits.java.multicatchblock;
//Let's see an example, to handle the exception without maintaining the order of exceptions.

class MultipleCatchBlock4{
    public static void main(String args[]){
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(Exception e){System.out.println("common task completed");}
        System.out.println("rest of the code...");
    }
}
