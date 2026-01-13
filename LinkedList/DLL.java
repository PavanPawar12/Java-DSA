public class DLL {
    

    Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }
    public void revdisplay(){
        Node temp = head;
        // go to lat node 
        while(temp.next != null){
            temp = temp.next;
        }
        // move backword
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println(" null");
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public static void main(String[] args){
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(17);
        
        list.display();
        list.revdisplay();
    }
}
