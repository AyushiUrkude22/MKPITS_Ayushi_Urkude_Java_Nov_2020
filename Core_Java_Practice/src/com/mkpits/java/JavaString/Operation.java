package src.com.mkpits.java.JavaString;
/* In Java, string is basically an object that represents sequence of char values. An array of characters
works same as Java string. For example */

class Operation{

    public static void main(String args[]){
        char[] name={'r','a','d','h','a'};
        String s=new String(name);
        System.out.println("name = " + s);

    }
}