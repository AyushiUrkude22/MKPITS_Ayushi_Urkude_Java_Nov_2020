package org.mkpits.java.thiskeyword;
// Write a program to Understanding the problem without this keyword.

class  Student{
        int rollno; //instance variable
        String name;
        float fee;
        Student(int rollno, String name, float fee, float v)
        {
            rollno=rollno;
            name=name;
            fee=fee;
        }

        void display(){System.out.println(rollno+" "+name+" "+fee);}
    }

class DoNotUseThisKeyword {
    public static void main(String args[])
    {
        Student s1=new Student(111,"Ayushi",5000f, 6000f);
        Student s2=new Student(112,"Akshay",6000f, 6000f);
        s1.display();
        s2.display();
    }
}