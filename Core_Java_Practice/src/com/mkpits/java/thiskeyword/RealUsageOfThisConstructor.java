package src.com.mkpits.java.thiskeyword;
/*The this() constructor call should be used to reuse the constructor from the constructor. It maintains the
chain between the constructors i.e. it is used for constructor chaining */

class StudentA {
    int rollno;
    String name,course;
    float fee;
    StudentA(int rollno,String name,String course)
    {
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    StudentA(int rollno,String name,String course,float fee)
    {

        this(rollno,name,course);//reusing constructor
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}

class RealUsageOfThisConstructor{
    public static void main(String args[])
    {
        StudentA s1=new StudentA(111,"palak","java", 6000f);
        StudentA s2=new StudentA(112,"kalash","java",6000f);
        s1.display();
        s2.display();
    }
}
