package src.com.mkpits.java.awt;
//Java program of AWT Checkbox Group.

import java.awt.*;
public class AWTCheckboxGroup
{
    AWTCheckboxGroup(){
        Frame f= new Frame("AWTCheckboxGroup");
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox checkBox1 = new Checkbox("Html", cbg, false);
        checkBox1.setBounds(110,110, 60,60);
        Checkbox checkBox2 = new Checkbox("Scc", cbg, true);
        checkBox2.setBounds(110,160, 60,60);
        f.add(checkBox1);
        f.add(checkBox2);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new AWTCheckboxGroup();
    }
}
