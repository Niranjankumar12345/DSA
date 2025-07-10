package dsa.doubleLinkedList;

public class Book {

    String bookName;
    Book next;
    Book prev;

    public Book(String bookName){
        this.bookName=bookName;
        this.next=null;
        this.prev=null;
    }

}
