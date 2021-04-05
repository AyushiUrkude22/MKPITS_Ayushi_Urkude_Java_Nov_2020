package com.mkpits.java.AWT;
/* The object of Choice class is used to show popup menu of choices. Choice selected by user is shown on
the top of a menu. It inherits Component class */

import java.awt.*;
class ChoiceExample
{
    ChoiceExample(){
        Frame f= new Frame();
        Choice c=new Choice();
        c.setBounds(100,100, 75,75);
        c.add("Item 1");
        c.add("Item 2");
        c.add("Item 3");
        c.add("Item 4");
        c.add("Item 5");
        f.add(c);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new ChoiceExample();
    }
}
