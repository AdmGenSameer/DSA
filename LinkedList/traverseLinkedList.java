package LinkedList;

public class traverseLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next= null;

        }
    }
    
        public static Node addFirst(Node head){
            Node firstNode = new Node(40);
            firstNode.next = head;
            return firstNode;
        }
    public static void main(String[] args) {
        
        Node newNode = new Node(10);
        newNode.next = new Node(20);
        Node head = newNode;
        Node tail = null;

        head = addFirst(head);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        

    }
}
