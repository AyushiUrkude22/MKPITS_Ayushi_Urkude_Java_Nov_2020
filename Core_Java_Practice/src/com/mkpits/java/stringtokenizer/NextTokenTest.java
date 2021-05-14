package src.com.mkpits.java.stringtokenizer;
//Example of nextToken(String delim) method of StringTokenizer class.

import java.util.*;
public class NextTokenTest {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my,name,is,khan");

// printing next token

        System.out.println("Next token is : " + st.nextToken(","));
    }
}
