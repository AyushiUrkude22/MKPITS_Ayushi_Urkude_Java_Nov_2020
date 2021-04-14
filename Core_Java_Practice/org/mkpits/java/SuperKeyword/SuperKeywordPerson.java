package org.mkpits.java.SuperKeyword;
/* class inherits Person class so all the properties of
Person will be inherited to Emp by default. To initialize all the property, we are using parent class
constructor from child class. In such way, we are reusing the parent class constructor */

class SuperKeywordPerson{
    int id;
    String name;
    void Person(int id, String name)
    {
        this.id=id;
        this.name=name;
    }

    public SuperKeywordPerson(int id, String name) {

    }
}
class Emp extends SuperKeywordPerson{
    float salary;
    Emp(int id,String name,float salary){
        super(id,name);//reusing parent constructor
        this.salary=salary;
    }
    void display(){System.out.println(id+" "+name+" "+salary);}
}
class TestSuper5{
    public static void main(String[] args){
        Emp e1=new Emp(1,"ankit",45000f);
        e1.display();
    }
}
