package src.com.mkpits.java.ArrayList;
//Java program of sort arraylist elements.

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.*;
public class SortArrayListElement {
    public static void main(String[] args) {
        ArrayList<String> stud=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++) {
            System.out.println("enter student name");
            String sn=sc.next();
            stud.add(sn);
        }
        Collections.sort(stud);
        for(String str : stud) {
            System.out.println("student name " + str);
        }

    }
}