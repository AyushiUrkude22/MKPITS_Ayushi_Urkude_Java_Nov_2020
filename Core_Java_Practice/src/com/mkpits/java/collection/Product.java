package src.com.mkpits.java.collection;
//Java program  to collect list of product using awt.

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

class Product{
    int  pid;
    String name;
    int quantity;
    float price;
    public Product(int pid,String name,int quantity,float price){
        this.pid=pid;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
}
class ListOfProductUsingAwt extends Frame {
    Label l1, l2, l3, l4;
    TextField t1, t2, t3, t4;
    TextArea ta;
    Button b1, b2,b3,b4;
    ArrayList<String> product = new ArrayList<String>();

    ListOfProductUsingAwt() {
        l1 = new Label("Enter product id:");
        l1.setBounds(10, 50, 150, 30);
        add(l1);
        t1 = new TextField();
        t1.setBounds(160, 50, 150, 30);
        add(t1);
        l2 = new Label("Enter product name:");
        l2.setBounds(10, 100, 150, 30);
        add(l2);
        t2 = new TextField();
        t2.setBounds(160, 100, 150, 30);
        add(t2);
        l3 = new Label("Enter product quantity:");
        l3.setBounds(10, 150, 150, 30);
        add(l3);
        t3 = new TextField();
        t3.setBounds(160, 150, 150, 30);
        add(t3);
        l4 = new Label("Enter product price:");
        l4.setBounds(10, 200, 150, 30);
        add(l4);
        t4 = new TextField();
        t4.setBounds(160, 200, 150, 30);
        add(t4);
        b1 = new Button("Add Product");
        b1.setBounds(50, 250, 100, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pr = new String();
                pr = ("\nproduct id:" + t1.getText() + "\nproduct name :" + t2.getText() +
                        "\nproduct quantity:" + t3.getText() + "\nproduct price :" + t4.getText());
                product.add(pr);
            }
        });

        add(b1);
        b2 = new Button("Display Product:");
        b2.setBounds(170, 250, 100, 30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                for(String str:product){
                    sb.append(str);
                    ta.setText(sb.toString());
                }
            }
        });
        add(b2);
        b3 = new Button("Sort Product:");
        b3.setBounds(290, 250, 100, 30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.sort(product);
                StringBuilder sb=new StringBuilder();
                for(String str:product){
                    sb.append(str);
                    ta.setText(sb.toString());
                }
            }
        });
        add(b3);
        b4 = new Button("Remove Product:");
        b4.setBounds(400, 250, 100, 30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product.removeAll(product);
                ta.setText("product detail remove:");
            }
        });
        add(b4);

        ta = new TextArea("Product List:");
        ta.setBounds(50, 300, 200, 200);
        add(ta);

        setLayout(null);
        setSize(600, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        ListOfProductUsingAwt p = new ListOfProductUsingAwt();
    }
}
