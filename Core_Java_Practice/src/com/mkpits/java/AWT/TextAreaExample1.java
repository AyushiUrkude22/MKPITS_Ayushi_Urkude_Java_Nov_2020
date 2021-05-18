package src.com.mkpits.java.awt;
/* The object of a TextArea class is a multi line region that displays text. It allows the editing of multiple line
text. It inherits TextComponent class */

import java.awt.*;
class TextAreaExample1
{
    TextAreaExample1(){
        Frame f= new Frame();
        TextArea area=new TextArea("Welcome to javatpoint");
        area.setBounds(10,30, 300,300);
        f.add(area);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new TextAreaExample1();
    }
}
