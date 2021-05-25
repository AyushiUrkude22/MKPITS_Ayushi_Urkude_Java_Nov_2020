package src.com.mkpits.java.arrayList;
//Java program by accepting name from the user.

import java.util.ArrayList;
import java.util.*;
public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<String> stud=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;i++) {
            System.out.println("enter student name");
            String sn=sc.next();
            stud.add(sn);
        }
        System.out.println(stud);

    }
}