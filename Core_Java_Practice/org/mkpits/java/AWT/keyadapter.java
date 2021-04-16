package org.mkpits.java.AWT;
// With key adapter.

import java.awt.*;
import java.awt.event.*;

public class keyadapter extends Frame
{
    TextField tf;
    public keyadapter()

    {
        Label l=new Label("enter characters");
        l.setBounds(10,30,100,30);
        add(l);
        tf=new TextField(20);
        tf.setBounds(120,30,100,30);
        tf. addKeyListener(new mykeyadapter(this) );
        add(tf);

// addMouseMotionListener(new MyMouseMotionAdapter(this))
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] arg)
    {
        keyadapter ad=new keyadapter();
    }
}
class mykeyadapter extends KeyAdapter
{
    keyadapter adapterdemo;
    public mykeyadapter(keyadapter adapterdemo)
    {
        this.adapterdemo=adapterdemo;
    }
    //handle mouseclicked event
    public void keyTyped(KeyEvent e)
    {
        System.out.println(" clicked");
    }
}
