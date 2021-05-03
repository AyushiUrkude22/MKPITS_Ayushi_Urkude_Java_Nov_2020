package src.com.mkpits.java.oops;
//Write a program create a class employee having attributes empno,empname , designation and salary and methods getdata and showdata.

class employee
{
    int empno;
    String empname;
    String designation;
    float salary;
    void getdata(int a,String b, String c,float d)
    {
        empno=a;
        empname=b;
        designation=c;
        salary=d;
    }
    void showdata()
    {
        System.out.println("empno = " + empno);
        System.out.println("empname = " + empname);
        System.out.println("designation = " + designation);
        System.out.println("salary = " + salary);
    }
}

class ClassEmployeeHavingAttributes
{
    public static void main(String[] arg)
    {
        employee emp=new employee();
        emp.getdata(111,"ayushi","manager",50000);
        emp.showdata();

    }
}