

public class DDL {
    private Node head;

    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
        
        Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
           
        }
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
           System.out.print(temp.data + "-> ");
           last = temp;
           temp = temp.next;
        }
        System.out.println( "END");

        System.out.println("Print in Reverse");

        while(last != null){
            System.out.print(last.data + " -> ");
            last = last.prev;

        }
        System.out.println("null");
        

    }
    public Node find(int value){
        Node temp = head;
        while(temp != null){
            if(temp.data == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            insertFirst(data);
            return;
        }
        Node last = head;
        
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
        

    }

    public void insert(int after, int data){
        Node p = find(after);
        if(p == null){
            System.out.println("Node does not exits ");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = p.next;
        p.next = newNode;
        newNode.prev = p;
        if(newNode.next != null){
            newNode.next.prev = newNode;
        }

    }
    // public void insertLast(int data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         insertFirst(data);
    //         return;
    //     }
    //     Node temp = head;
    //     while(temp.next != null){
    //         temp = temp.next;
    //     }
    //     temp.next = newNode;
    // }

    public static void main(String[] args){
        DDL list=  new DDL();
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(14);
        list.insertFirst(15);
        list.insertLast(100);
        list.insert(14, 20);
        list.display();
    }
}
