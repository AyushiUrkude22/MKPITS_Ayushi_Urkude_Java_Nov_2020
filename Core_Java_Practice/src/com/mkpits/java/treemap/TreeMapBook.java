package src.com.mkpits.java.treemap;
//Java TreeMap Example: Book.

import java.util.*;
class TreeMapBook {
    int id;
    String name,author,publisher;
    int quantity;
    public TreeMapBook(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;

        this.publisher = publisher;
        this.quantity = quantity;
    }
}
class MapExample {
    public static void main(String[] args) {
//Creating map of Books
        Map<Integer,TreeMapBook> map=new TreeMap<Integer,TreeMapBook>();
//Creating Books
        TreeMapBook b1=new TreeMapBook(101,"Let us C","Yashwant Kanetkar","BPB",8);
        TreeMapBook b2=new TreeMapBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        TreeMapBook b3=new TreeMapBook(103,"Operating System","Galvin","Wiley",6);
//Adding Books to map
        map.put(2,b2);
        map.put(1,b1);
        map.put(3,b3);

//Traversing map
        for(Map.Entry<Integer, TreeMapBook> entry:map.entrySet()){
            int key=entry.getKey();
            TreeMapBook b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}