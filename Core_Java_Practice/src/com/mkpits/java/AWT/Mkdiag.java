package org.mkpits.java.AWT;
// Awt example Mkdiag.

import java.awt.*;

public class Mkdiag
{
    public static void main(String arg[])
    {
        Frame f=new Frame("my frame");
        String title="raisonic";
        boolean modal=true;
        Dialog dlg=new Dialog(f,title,modal);
        Label la=new Label("do you want to close");
        Button ba=new Button("ok");

        Button ba1=new Button("cancel");
        f.setSize(300,300);
        f.setVisible(true);
        dlg.add(la);
        dlg.add(ba);
        dlg.add(ba1);
        dlg.setSize(200,200);
        dlg.setVisible(true);
    }
}
