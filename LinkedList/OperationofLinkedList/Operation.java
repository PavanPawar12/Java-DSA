
// // Nothing is hard, just be curiour for doing hard things!!!! ---> Pavan Pawar

// public class Operation {
//     // mojor operation on linked list
//     Node head;
//     private int size;
//     Operation(){
//         this.size = 0;
//     }
//     public class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//             size++;

//         }
//     }
//     public void addFirst(int value){
//         Node newNode = new Node(value);

//         if(head == null){
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;

//     }

//     public void addLast(int data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }

//         Node currNode = head;
//         while(currNode.next != null){
//             currNode = currNode.next;
//         }
//         currNode.next = newNode;
//     }

//     // delete first
//     public void deleteFirst(){
//         if(head == null){
//             System.out.println("The list is empty");
//             return;
//         }
//         size++;
//         head = head.next;
//     }

//     public void deleteLast(){
//         if(head == null){
//             System.out.println("The list is empty");
//             return;
//         }

//         size--;
//         if(head.next == null){
//             head = null;
//             return;
//         }

//         Node secondLast = head;
//         Node lastNode = head.next;  // head.next = null -> lastNode = null

//         while(lastNode.next != null){
//             lastNode = lastNode.next;
//             secondLast = secondLast.next;
//         }
//         secondLast.next = null;
//     }

//     public int getSize(){
//         return size;
//     }
//     public void display(){
//         Node temp = head;
//         if(head == null){
//             System.out.println("List is empty!!!");
//         }
//         while(temp != null){
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args){
//         Operation  list = new Operation();
//         list.addFirst(2);
//         list.addFirst(3);
//         list.addLast(100);
//         list.addLast(200);
//         list.addLast(300);
//         list.display();
//         list.deleteFirst();

//         list.display();
//         list.deleteFirst();
//         list.addFirst(1212);
//         list.display();
//         System.out.println(list.getSize());
//     }
// }

public class Operation {

    private Node head;
    private Node tail;

    private int size;

    public Operation() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    // while loop programming language

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){  // time complexity of this is : constant 
        if (tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
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
            insertLast(val);
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

    
    public void display(){
        Node temp = head;
        while(temp !=  null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
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

    // delete at perticular index
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
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public static void main(String[] args) {
        Operation list = new Operation();
        
        list.insertFirst(24);
        list.insertFirst(25);
        list.insertFirst(26);
        list.insertLast(23);
        list.insertLast(199);
        list.display();
        list.insert(123, 2);
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println("last Deleted:  "+ list.deleteLast());
        list.display();
        System.out.println("Delete value : "+ list.delete(2));
        list.display();
    }
}