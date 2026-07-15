package LinkedList;

public class LinkedList {
    public static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

}
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //step1: create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2: newNode next = head
        newNode.next = head;
        //step3: head = newNode
        head = newNode;
        
        
    }

    public void addLast(int data){
        // create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        // point tail next towards newNode
        tail.next = newNode;
        // newNode now will be the new tail of Linkedlist
        tail = newNode;


    }

     public void display(){
        if(head == null){
            System.out.println("LinkedList is empty.");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
     }
    

    public static void main(String [] args){
        LinkedList ll = new LinkedList();
        ll.display();
        ll.addFirst(2);
        ll.display();
        ll.addFirst(1);
        ll.display();
        ll.addLast(3);
        ll.display();
        ll.addLast(4);
        ll.display();
    }
}
