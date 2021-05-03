package src.com.mkpits.java.aggregation;
//Write a program to create a class calculator having field addition substraction multiplication division.

import java.util.*;
class Calculator
{
    int num1,num2,res=0;
    double addition(int n1,int n2)
    {
        return n1+n2;
    }
    double substraction(int n1,int n2)
    {
        return n1-n2;
    }
    double multiplication(int n1,int n2)
    {
        return n1*n2;
    }
    double division(int n1,int n2)
    {
        return n1/n2;
    }
}

class CreateClassCalculator
{
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("My calculator");
        System.out.println("enter number 1");
        int num1=s.nextInt();
        System.out.println("enter number 2");
        int num2=s.nextInt();
        double res=0.0;
        Calculator c=new Calculator();
        System.out.println("enter your choice :\n 1 :Addition \n 2 :Substraction \n 3:Multiplication \n 4:Division");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
                res=c.addition(num1,num2);
                break;

            case 2:

                res=c.substraction(num1,num2);

                break;
            case 3:

                res=c.multiplication(num1,num2);

                break;
            case 4:

                res=c.division(num1,num2);

                break;
            default:
                System.out.println("invalid choice entered");
                break;
        }
        System.out.println("Result = " + res);

    }
}
