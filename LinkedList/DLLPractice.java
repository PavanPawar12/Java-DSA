public class DLLPractice {
    private Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void addLast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
        
    }
    
    public void insertAtPosition(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index -1; i++) {
            if(temp == null){
                System.out.println("Something out of range");
            }
            temp = temp.next;
        }

        Node node = new Node(val);
        node.next = temp.next;
        node.prev = temp;
        if(temp.next != null){
            temp.next.prev = node;
        }
        temp.next = node;

    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("list is Empty");
            return;
        }

        head = head.next;
        if(head != null){
            head.prev = null;
        }
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;

        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
    }
    public void display(){
        Node node = head;
        Node  last = null;

        while(node != null){
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("null");
        System.out.println("Print in reverse order");
        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");

    }
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    public static void main(String[] args){
        DLLPractice list = new DLLPractice();
        list.insertFirst(12); 
        list.insertFirst(14); 
        list.insertFirst(15);
        list.addLast(1000);
        list.display();
        list.insertAtPosition(1212, 0);
        list.display(); 
        list.deleteFirst();
        System.out.println("After deleting first element in the list");
        list.display(); 
        list.deleteLast();
        System.out.println("After deleting last value in the list");
        list.display();
    }
}
