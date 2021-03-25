package org.mkpits.java.thiskeyword;
// Write a program to understand the problem if we use this keyword.

class Student1{
    int rollno;
    String name;
    float fee;
    Student1(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}

class UseThisKeyword{
    public static void main(String args[])
    {
        Student s1=new Student(111,"Ayushi",5000f);
        Student s2=new Student(112,"Akshay",6000f);
        s1.display();
        s2.display();
    }
}
