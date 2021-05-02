package org.mkpits.java.inheritance;
/*  Programmer is the subclass and Employee is the superclass. The relationship between the two classes is
 Programmer IS-A Employee. It means that Programmer is a type of Employee */

class RelationshipBetweenTheTwoClasses{
    float salary=50000;
}
class Programmer extends RelationshipBetweenTheTwoClasses
{
    int bonus=20000;
    public static void main(String args[])
    {
        Programmer p=new Programmer();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }
}
