package src.com.mkpits.java.hashtableclass;
//Java Hashtable Example: Book.

import java.util.*;
class HashtableBook {
    int id;
    String name,author,publisher;
    int quantity;
    public HashtableBook(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
class HashtableExample {
    public static void main(String[] args) {
//Creating map of Books
        Map<Integer,HashtableBook> map=new Hashtable<Integer,HashtableBook>();
//Creating Books
        HashtableBook b1=new HashtableBook(101,"Let us C","Yashwant Kanetkar","BPB",8);
        HashtableBook b2=new HashtableBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        HashtableBook b3=new HashtableBook(103,"Operating System","Galvin","Wiley",6);
//Adding Books to map
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);
//Traversing map
        for(Map.Entry<Integer, HashtableBook> entry:map.entrySet()){
            int key=entry.getKey();
            HashtableBook b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

    }
}