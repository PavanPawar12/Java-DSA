class LL{

    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}

public class LinkedList {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(12);
        list.addFirst(14);
        list.addFirst(15);
        list.display();

    }   
}
