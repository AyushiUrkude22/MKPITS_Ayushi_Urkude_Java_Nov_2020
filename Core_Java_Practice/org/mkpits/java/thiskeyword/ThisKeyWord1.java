package org.mkpits.java.thiskeyword;
//

class StudentC{
    int rollno;
    String name,course;
    float fee;
    StudentC(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    StudentC(int rollno,String name,String course,float fee)
    {
        this.fee=fee;
        this(rollno,name,course);//C.T.Error
    }

    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class ThisKeyWord1{
    public static void main(String args[])
    {
        Student s1=new Student(111,"palak","java");
        Student s2=new Student(112,"ayushi","java",6000f);
        s1.display();
        s2.display();
    }
}
