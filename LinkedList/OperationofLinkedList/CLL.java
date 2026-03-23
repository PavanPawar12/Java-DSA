public class CLL {
    private Node head;
    private Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        Node temp =  head;
        if(head != null){
            do{
                System.out.print(temp.data+ " -> ");
                temp = temp.next;
            } while(temp != head);
            System.out.println("HEAD");
        }
    }
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void delete(int data){
        Node temp = head;
        if(temp.data == data){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = temp.next;
            if(n.data == data){
                temp.next = n.next;

            if(n == tail){
                tail = temp;
            }

            break;
            }
            temp = temp.next;
        }while(temp != null);
    }
    public static void main(String[] args){
        CLL list = new CLL();
        list.insert(12);
        list.insert(13);
        list.insert(14);
        list.delete(13);
        list.display();
    }
}
