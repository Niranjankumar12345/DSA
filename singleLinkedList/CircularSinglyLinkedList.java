package dsa.singleLinkedList;

public class CircularSinglyLinkedList {

    private Node head = null;
    private Node tail = null;

    public CircularSinglyLinkedList() {
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            this.tail.next = this.head;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
            this.tail.next = this.head;
        }

    }

    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = this.tail = newNode;
            this.tail.next = this.head;
        } else {
            newNode.next = this.head;
            this.head = newNode;
            this.tail.next = this.head;
        }

    }

    public void delete(int key) {
        if (this.head != null) {
            Node temp = this.head;
            Node prev = null;
            if (this.head.data == key) {
                if (this.head == this.tail) {
                    this.head = this.tail = null;
                } else {
                    this.tail.next = this.head.next;
                    this.head = this.head.next;
                    System.out.println("Head has key :  tail.next :  " + this.tail.next.data + " head.next  " + this.head.next.data);
                }

            } else {
                do {
                    prev = temp;
                    temp = temp.next;
                    System.out.println("Key found : " + temp.data);
                } while(temp != this.head && temp.data != key);

                if (temp.data == key) {
                    prev.next = temp.next;
                    if (temp == this.tail) {
                        this.tail = prev;
                    }
                }

            }
        }
    }

    public void printList() {
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = this.head;

            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while(temp != this.head);

            System.out.println("(Head)");
        }
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.insertEnd(10);
        csll.insertEnd(20);
        csll.insertEnd(30);
        csll.insertBeginning(5);
        System.out.println("Circular Singly Linked List:");
        csll.printList();
        System.out.println("Deleting 20...");
        csll.delete(30);
        System.out.println("Updated Circular Singly Linked List:");
        csll.printList();
    }
}
