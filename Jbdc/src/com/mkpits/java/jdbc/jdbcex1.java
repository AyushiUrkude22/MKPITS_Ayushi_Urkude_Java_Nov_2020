package com.mkpits.java.jdbc;
//program to insert records in our employee table created.

import java.sql.*;
import java.util.*;
public class jdbcex1 {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter empno");
        int empid=sc.nextInt();
        System.out.println("enter empname");
        String empname=sc.next();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits", "postgres", "sa");
        System.out.println("connected successfully ");
            stmt =con.createStatement();
            String str="insert into employee(empid,empname) values("+empid+",'"+empname+"')";
            stmt.executeUpdate(str);
            System.out.println("record inserted successfully");

            con.close();
        }catch (Exception ee) {
//code to connect java with mysql database
            System.out.println(ee.toString());
        }
    }
}
