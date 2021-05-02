package org.mkpits.java.constructor;
//Write a program to create a class employee with blank and parameterized constructor.

import java.util.Scanner;

class employee1
{
    int empno;
    String empname;
    String designation;
    float salary;

    public employee1()
    {
        empno=2;
        empname="bond";
        designation="detective";
        salary=5555.5f;
    }

    public employee1(int en,String ena, String des, float sal)
    {
        empno=en;
        empname=ena;
        designation=des;
        salary=sal;

    }
    void showdata()
    {
        System.out.println("------------------------------------- ");
        System.out.println("-----------Employee Details--------- ");

        System.out.println("empno = " + empno);
        System.out.println("empname = " + empname);
        System.out.println("designation = " + designation);
        System.out.println("salary = " + salary);
        System.out.println("------------------------------------- ");
    }
}

class ParameterizedConstructor
{
    public static void main(String[] arg)
    {

        Scanner s1=new Scanner(System.in);
        employee emp=new employee();
        emp.showdata();

        System.out.println("enter employee no");
        int en=s1.nextInt();

        System.out.println("enter emp name ");
        String ename=s1.next();

        System.out.println("enter emp deisgnation ");
        String ed=s1.next();

        System.out.println("enter emp salary ");
        float sa=s1.nextFloat();

        employee emp1=new employee(en,ename,ed,sa);
        emp1.showdata();

    }

}
