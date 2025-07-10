package dsa.doubleLinkedList;

public class CircularDoublyLinkedList {

    private Node head = null;
    private Node tail = null;

    public CircularDoublyLinkedList() {
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = this.tail = newNode;
            this.head.next = this.head;
            this.head.prev = this.head;
        } else {
            newNode.prev = this.tail;
            newNode.next = this.head;
            this.tail.next = newNode;
            this.head.prev = newNode;
            this.tail = newNode;
        }
    }

    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = this.tail = newNode;
            this.head.next = this.head;
            this.head.prev = this.head;
        } else {
            newNode.next = this.head;
            newNode.prev = this.tail;
            this.head.prev = newNode;
            this.tail.next = newNode;
            this.head = newNode;
        }

    }

    public void delete(int key) {
        if (this.head != null) {
            Node temp = this.head;
            if (this.head == this.tail && this.head.data == key) {
                this.head = this.tail = null;
            } else if (this.head.data == key) {
                this.head = this.head.next;
                this.head.prev = this.tail;
                this.tail.next = this.head;
            } else {
                while(temp.data != key) {
                    temp = temp.next;
                    if (temp == this.head) {
                        return;
                    }
                }

                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                if (temp == this.tail) {
                    this.tail = this.tail.prev;
                }

            }
        }
    }

    public void printForward() {
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = this.head;

            do {
                System.out.print(temp.data + " ⇄ ");
                temp = temp.next;
            } while(temp != this.head);

            System.out.println("(Head)");
        }
    }

    public void printBackward() {
        if (this.tail == null) {
            System.out.println("List is empty");
        } else {
            Node temp = this.tail;

            do {
                System.out.print(temp.data + " ⇄ ");
                temp = temp.prev;
            } while(temp != this.tail);

            System.out.println("(Tail)");
        }
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.insertEnd(10);
        cdll.insertEnd(20);
        cdll.insertEnd(30);
        cdll.insertBeginning(5);
        System.out.println("Circular Doubly Linked List (Forward):");
        cdll.printForward();
        System.out.println("Circular Doubly Linked List (Backward):");
        cdll.printBackward();
        System.out.println("Deleting 20...");
        cdll.delete(20);
        System.out.println("Updated Circular Doubly Linked List (Forward):");
        cdll.printForward();
    }
}
