package org.mkpits.java.StringTokenizer;
//Simple example of StringTokenizer class.

import java.util.StringTokenizer;
public class StringTokenizerSimple1{
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer("my .name .is .palak",".");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
