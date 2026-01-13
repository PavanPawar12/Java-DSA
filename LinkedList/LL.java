
public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }
    
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
       
    }  

    public void addLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val); // time complexity is constant 
        tail.next = node;
        tail = node;
        size++;

    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            addLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // insert using recursion
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
        
    }
    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);// create a new node it contains val and next node that is passed to it.
            size++;
            return temp; // return the created node
        }
        node.next = insertRec(val, index - 1, node.next); // link the node 
        return node;
    
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
        
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        return val;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void display(){
        Node temp = head;
        while(temp != null){     // time complexity is  o(n) traversing first to last
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Question on leetcode 

    public void duplicate(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            } else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node (int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        // list.addLast(12);
        // list.addLast(14);
        // list.addLast(15);
        // list.insertFirst(23);
        // list.insert(1000, 3);
        // list.display();
        // System.out.println(list.deleteFirst() + " is deleted from the list");
        // list.deleteFirst();
        // list.display();
        // System.out.println(list.deleteLast() + " is deleted ");
        // list.display();
        // list.insertRec(111, 1);
        // list.display();

        // for solving question
        list.addLast(1);
        list.addLast(1);
        list.addLast(1);
        list.addLast(3);
        list.addLast(3);
        list.addLast(4);
        list.display();
        list.duplicate();
        list.display(); 
    }
}