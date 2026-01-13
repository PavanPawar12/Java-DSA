public class LList {
    Node head;
    public class Node{
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
    // intertion to end
    public void addEnd(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    public void printData(){
        Node temp = head;
        while(temp != null ){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LList list = new LList();
        list.addEnd(1);
        list.addEnd(2);
        list.addEnd(3);
        list.addEnd(4);
        list.addFirst(100);
        list.printData();
    }
}
