package com.mkpits.java.AWT;
/* An adapter class provides the default implementation of all methods in an event listener interface.
Adapter classes are very useful when you want to process only few of the events that are handled by a
particular event listener interface. You can define a new class by extending one of the adapter classes
and implement only those events relevant to you*/

import java.awt.*;
import java.awt.event.*;
import java.awt.*;
public class Adapterdemo extends Frame
{
    public Adapterdemo()
    {
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] arg)
    {
        Adapterdemo ad=new Adapterdemo();
    }
}
class MyMouseAdapter extends MouseAdapter
{
    Adapterdemo adapterdemo;
    public MyMouseAdapter(Adapterdemo adapterdemo)
    {
        this.adapterdemo=adapterdemo;
    }
    //handle mouseclicked event
    public void mouseClicked(MouseEvent me)
    {
        System.out.println("mouse clicked" + me.getX() +"," + me.getY());
    }
}
class MyMouseMotionAdapter extends

        MouseMotionAdapter
{
    Adapterdemo adapterdemo;
    public MyMouseMotionAdapter(Adapterdemo adapterdemo)
    {
        this.adapterdemo=adapterdemo;
    }
    //handle mouse dragged
    public void mouseDragged(MouseEvent me)
    {
        System.out.println("mouse dragged");
    }
}
