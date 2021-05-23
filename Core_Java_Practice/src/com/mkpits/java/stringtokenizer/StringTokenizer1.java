package src.com.mkpits.java.stringtokenizer;
//Java example of string tokenizer.

import java.util.*;
class st1 {
    public static void main(String[] args) {
        String str="welcome, to, java, programming";
        String arr[]=new String[4];
        StringTokenizer st=new
                StringTokenizer(str,",");
        int i=0;
        while (st.hasMoreTokens())
        {
// System.out.println(st.nextToken());

            arr[i]=st.nextToken();
            i=i+1;
        }
        for( i=0;i<4;i++)
        {
            System.out.println(arr[i]);
        }
    }
}