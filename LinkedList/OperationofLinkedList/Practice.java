

public class Practice {
    Node head;

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
        
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Practice list = new Practice();
        list.addFirst(12);
        list.addFirst(22);
        list.addFirst(23);
        list.addLast(100);
        list.display();
    }
}
