package src.com.mkpits.java.constructor;
// Write a program to create a class employee with blank constructor.

import java.util.*;
class employee
{
    int empno;
    String empname;
    String designation;
    float salary;

    public employee()
    {
        empno=9;
        empname="bond";
        designation="detective";
        salary=4444.4f;
    }

    public employee(int en, String ename, String ed, float sa) {

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

class BlankConstructor
{
    public static void main(String[] arg)
    {

        Scanner s1=new Scanner(System.in);
        employee emp=new employee();
        emp.showdata();

    }
}