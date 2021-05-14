package src.com.mkpits.java.stringtokenizer;
/* the simple example of StringTokenizer class that tokenizes a string "my name is ayushi" on the
basis of whitespace.*/

import java.util.StringTokenizer;
public class StringTokenizerSimple{
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer("my name is khan"," ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}