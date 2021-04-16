package org.mkpits.java.AWT;
// mouse without adapter.

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="mouseevent3" width=150 height=200>
</applet> */
class mouseevent3 extends Frame implements
        MouseListener,MouseMotionListener

{
    TextField text1;
    public mouseevent3()
    {
        text1=new TextField();
        text1.setBounds(10,30,100,30);
        add(text1);
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mousePressed(MouseEvent e)
    {
        text1.setText("left mouse button down at "
                + e.getX() + "," + e.getY());

    }
    public void mouseReleased(MouseEvent e)
    {
        text1.setText("mouse button went up");
    }
    public void mouseEntered(MouseEvent e)
    {
        text1.setText("mouse entered");
    }
    public void mouseExited(MouseEvent e)
    {
        text1.setText("mouse exited");
    }
    public void mouseDragged(MouseEvent e)
    {
        text1.setText("mouse dragged");
    }
    public void mouseMoved(MouseEvent e)
    {
//text1.setText("mouse was moved");

    }
    public void mouseClicked(MouseEvent e)
    {
        text1.setText("mouse clicked");
    }
    public static void main(String[] arg)
    {
        mouseevent3 me=new mouseevent3();
    }
}
