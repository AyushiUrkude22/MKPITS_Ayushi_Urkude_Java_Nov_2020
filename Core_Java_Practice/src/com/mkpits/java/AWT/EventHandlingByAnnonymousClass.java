package src.com.mkpits.java.awt;
//Example of event handling by Annonymous class.

import java.awt.*;
import java.awt.event.*;
class AEvent6 extends Frame{
    TextField tf;
    AEvent6(){
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("click me");
        b.setBounds(50,120,80,30);

        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

            }

            public void actionPerformed(){
                tf.setText("hello");
            }
        }
        );
        add(b);add(tf);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]){
        new AEvent6();
    }
}
