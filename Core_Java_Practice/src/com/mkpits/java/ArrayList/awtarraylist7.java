package src.com.mkpits.java.ArrayList;
//Java program of awt array list.

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
public class awtarraylist7 extends Frame{
    Label l1,l2;
    TextField t1;
    TextArea ta;
    Button b1,b2;
    ArrayList<String> student =new ArrayList<String>();
    public awtarraylist7() {
        l1=new Label("enter student name");
        l1.setBounds(10,50,200,30);
        add(l1);
        t1=new TextField();
        t1.setBounds(220,50,200,30);
        add(t1);
        b1=new Button("add student");
        b1.setBounds(100,150,150,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                student.add(t1.getText());
                t1.setText("");
            }
        });
        add(b1);
        b2=new Button("display student");
        b2.setBounds(260,150,150,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                StringBuilder sb=new StringBuilder();
/*
Iterator itr=student.iterator();
while (itr.hasNext()) {
sb.append("student name : " +
itr.next() +"\n");
}
*/
                for(String str : student) {
                    sb.append("student name : " + str
                            +"\n");
                }
                ta.setText(sb.toString());
            }
        });
        add(b2);
        ta=new TextArea("student list");
        ta.setBounds(100,200,300,150);
        add(ta);

        setLayout(null);
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        awtarraylist7 arl=new awtarraylist7();
    }
}
