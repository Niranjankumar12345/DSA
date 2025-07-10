package dsa.doubleLinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
    }

    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
    }

    public void delete(int key) {
        Node temp = this.head;
        if (temp != null && temp.data == key) {
            this.head = temp.next;
            if (this.head != null) {
                this.head.prev = null;
            }

        } else {
            while(temp != null && temp.data != key) {
                temp = temp.next;
                System.out.println("Key found : " + temp.data);
            }

            if (temp != null) {
                if (temp == this.tail) {
                    this.tail = this.tail.prev;
                    this.tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
            }
        }
    }

    public void printForward() {
        for(Node temp = this.head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " ⇄ ");
        }

        System.out.println("null");
    }

    public void printBackward() {
        for(Node temp = this.tail; temp != null; temp = temp.prev) {
            System.out.print(temp.data + " ⇄ ");
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertEnd(10);
        dll.insertEnd(20);
        dll.insertEnd(30);
        dll.insertBeginning(5);
        System.out.println("Doubly Linked List (Forward):");
        dll.printForward();
        System.out.println("Doubly Linked List (Backward):");
        dll.printBackward();
        System.out.println("Deleting 20...");
        dll.delete(20);
        System.out.println("Updated DLL (Forward):");
        dll.printForward();
    }
}
