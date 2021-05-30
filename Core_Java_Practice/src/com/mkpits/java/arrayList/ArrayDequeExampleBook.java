package src.com.mkpits.java.arrayList;
//Java ArrayDeque Example: Book.

import java.util.*;
class ArrayDequeExampleBook {
    int id;

    String name,author,publisher;
    int quantity;
    public ArrayDequeExampleBook(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
class ArrayDequeExampleA {
    public static void main(String[] args) {
        Deque<Book> set=new ArrayDeque<Book>();
//Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
//Adding Books to Deque
        set.add(b1);
        set.add(b2);
        set.add(b3);
//Traversing ArrayDeque
        for(Book b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}