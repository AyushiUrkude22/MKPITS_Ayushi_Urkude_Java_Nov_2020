package org.mkpits.java.aggregation;
/*Write a program to create a class Address having field city, state , pincode
create a class Employee having field empno, empname and address of type Address class */

class Address1
{
    String city;
    String state;
    int pincode;
}
//creating a class employee
class Employee
{
    int empno;
    String empname;
    Address address;
    void getdata(int empno,String empname, Address address)
    {
        this.empno=empno;
        this.empname=empname;
        this.address=address;
    }
    void showdata()
    {
        System.out.println("empno " + empno);
        System.out.println("empname " + empname);
        System.out.println("city " + address.city);
        System.out.println("state " + address.state);
        System.out.println("pincode " + address.pincode);
    }

}
////////////
class CreateClassAddress
{
    public static void main(String[] arg)
    {
        Employee emp=new Employee();
        Address adr=new Address();

        adr.city="nagpur";
        adr.state="maharashtra";
        adr.pincode="444414";
        emp.getdata(22,"ayushi",adr);
        emp.showdata();

    }
}