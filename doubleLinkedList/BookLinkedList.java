package dsa.doubleLinkedList;

import java.util.Scanner;

public class BookLinkedList {

   static Book head;
   static Book tail;

    public void insert(String data){
        Book newBook=new Book(data);
        if(head == null){
           head=tail=newBook;
            return;
        }
        tail.next=newBook;
        newBook.prev=tail;
        tail=newBook;
    }

    public String searchNext(String key){
        Book temp=head;
        if (tail.bookName.equalsIgnoreCase(key)){
            System.out.println("It does not Have Next Book");
            return "Social";
        }
        while (temp!=null){
            if(temp.bookName.equalsIgnoreCase(key)){
                return temp.next.bookName;
            }
            temp=temp.next;
        }
        return "Incorrect Search";
    }

    public String searchPrev(String key){
        Book temp=head;
        if (head.bookName.equalsIgnoreCase(key)){
            System.out.println("It does not Have Previous Book");
            return "Tamil";
        }

        while (temp!=null){
            if(temp.bookName.equalsIgnoreCase(key)){
                return temp.prev.bookName;
            }
            temp=temp.next;
        }
        return "Incorrect Search";
    }

    public  void printBooks(){

        Book temp=head;
        while (temp!=null){
            System.out.print(temp.bookName+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void userCase(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Book Name :");
        String books=scanner.next();

        while (true) {
            System.out.println("Enter Search Type \n P mean Previous \n N mean next \n H mean Head \n T mean Tail \n C mean close :");
            switch (scanner.next().toUpperCase()) {
                case "P":
                    books =searchPrev(books);
                    System.out.println(books);
                    break;
                case "N":
                    books =searchNext(books);
                    System.out.println(books);
                    break;
                case "H":
                    System.out.println(head.bookName);
                    break;
                case "T":
                    System.out.println(tail.bookName);
                    break;
                case "C":
                    System.out.println("Program will End");
                    return;
            }
            if(books.equalsIgnoreCase("Incorrect Search"))
                return;
        }
    }
    public static void main(String[] args) {
        BookLinkedList book = new BookLinkedList();
        book.insert("Tamil");
        book.insert("English");
        book.insert("Maths");
        book.insert("Science");
        book.insert("Social");

        book.printBooks();
        book.userCase();
    }
}