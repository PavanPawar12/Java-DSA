public class LL{

    private Node head;
    private Node tail;
    private int size;
    LL(){
        this.size = 0;
    }
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // insert first
    public void insertFirst(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertLast(int value){
        Node newNode = new Node(value);
        if(head == null){
            insertFirst(value);
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

        size++;

    }

    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        
        Node newNode = new Node(index);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public int deleteFirst(){
        int val = head.data;
        head = head.next;
        if(head == null){
            System.out.println(" List is empty..");
            return -1;
        }
        size--;
        return val;

    }
    public int deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return -1;
        }

        if(head.next == null){
            return deleteFirst();
        }

        Node temp = head;
        while(temp.next.next != null){
            temp= temp.next;
        }

        int val = temp.next.data;
        temp.next = null;
        size--;
        return val;
    }

    // delete 
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteFirst();
        }

        Node prev = get(index - 1);
        int val = prev.next.data;
        prev.next = prev.next.next;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data  + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(14);
        list.insertFirst(13);
        list.insertFirst(12);
        list.insertFirst(11);
        list.insertFirst(10);
        
        list.insertFirst(12);
        list.insertLast(100);
        list.display();
        // list.insert(123, 2);
        System.out.println(list.deleteFirst() + " is deleted!");
        list.display();
        System.out.println(list.deleteLast() + " is deleted!");
        list.display();
        System.out.println(list.delete(2) + " is deleted!");
        list.display();


        
    }
}