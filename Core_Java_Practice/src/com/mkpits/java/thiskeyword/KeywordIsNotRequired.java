package src.com.mkpits.java.thiskeyword;
//Write a program to where this keyword is not required.

class  Student2{
    int rollno;
    String name;
    float fee;
    Student2(int r,String n,float f){
        rollno=r;
        name=n;
        fee=f;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}

class KeywordIsNotRequired{
    public static void main(String args[])
    {
        Student s1=new Student(111,"Ayushi",5000f, 6000f);
        Student s2=new Student(112,"Akshay",6000f, 6000f);
        s1.display();
        s2.display();

    }
}
