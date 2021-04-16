package org.mkpits.java.thiskeyword;
// Write a program to understand the problem if we use this keyword.

class Student1{
    int rollno;
    String name;
    float fee;
    Student1(int rollno, String name, float v, float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}

class UseThisKeyword{
    public static void main(String args[])
    {
        Student1 s1=new Student1(111,"Ayushi",5000f, 6000f);
        Student1 s2=new Student1(112,"Akshay",6000f, 6000f);
        s1.display();
        s2.display();
    }
}
