package dsa.singleLinkedList;

public class SingleLinkedList {
    private Node head;
    
    public void insert(int data){
        Node newnode=new Node(data);
        if(head == null){
            head=newnode;
            return;
        }
        Node temp=head;
        while (temp.next !=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    
    public void insertInBeginning(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void delete(int key){
        Node temp=head,prev=null;
        if(temp!=null&&temp.data==key){
            head=temp.next;
            return;
        }
        while (temp!=null && temp.data!=key){
            prev=temp;
            temp=temp.next;
            System.out.println(temp.data +"---"+key);
        }
        if(temp==null)
            return;

        prev.next=temp.next;
        System.out.println(prev.data +"----"+temp.next.data);
    }

    public boolean search(int key){
        Node temp =head;
        while (temp!=null){
           if(temp.data == key){
               return true;
           }
           temp=temp.next;
        }
        return false;
    }

    public void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int size(){
        int count=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        SingleLinkedList list=new SingleLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insertInBeginning(5);

        System.out.print("LinkedList :");
        list.printList();

        System.out.println("Searching for 20 :"+list.search(20));
        System.out.println("Deleting 10 ...");
        list.delete(10);
        list.printList();
        System.out.println("Size :"+list.size());
    }
}