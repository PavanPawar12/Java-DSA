public class DublyLinkedList {

    Node head;
    private  class Node{
         int val;
         Node next;
         Node prev;

         public Node(int val, Node next, Node prev){
            this.val = val;
            this.next= next;
            this.prev=prev;
         }
    }
    
    public void insertFirst(int val){
        Node node = new Node(val, head, head);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }
    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("null");

        System.out.println("Print in reverse");
        while(last != null){
            System.out.print(last.val+ " -> ");
            last = last.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DublyLinkedList list = new DublyLinkedList();
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(14);
        list.display();
    }
}
