package src.com.mkpits.java.awt;
// Java AWT Toolkit Example: beep().

import java.awt.*;
import java.awt.event.*;
class AWTToolkitExample {
    public static void main(String[] args) {
        Frame f=new Frame("AWTToolkitExample");
        Button b=new Button("beep");
        b.setBounds(50,100,60,30);

        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Toolkit.getDefaultToolkit().beep();
            }
        });
    }
}