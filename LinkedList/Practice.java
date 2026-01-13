// public class Practice {
//     Node head;
//     public class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }

//     }
//     public void addFirst(int data){
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//     }
//     // intertion to end
//     public void addEnd(int data){
//         Node newNode = new Node(data);
        
//         if(head == null){
//             head = newNode;
//             return;
//         }

//         Node temp = head;
//         while(temp.next != null){
//             head = head.next;
//         }
//         temp.next = newNode;
        
//     }

//     public void printData(){
//         Node temp = head;
//         while(temp != null ){
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
//     public static void main(String[] args) {
//         Practice list = new Practice();
//         list.addEnd(1);
//         list.addEnd(2);
    
//         list.addEnd(4);
//         list.addEnd(5);
//         list.printData();
//     }
// }


// public class Practice {
//     Node head;
//     // basic about node
//     class Node{
//         int data;
//         Node next;


//         Node(int data){
//             this.data  = data;
//             this.next  = null;
//         }
//     }

//     public void addFirst(int data){
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
        
//     }

//     public void display(){
//         Node temp = head;
//         while (temp != null) { 
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }

//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         Practice list = new Practice();
//         list.addFirst(12);
//         list.addFirst(14);
//         list.addFirst(15);
//         list.display();
//     }
// }


// public class Practice {

   
    // private Node head;
    // private Node tail;

    // private int size;


    // public void insertFirst(int val){
    //     Node node = new Node(val);
    //     node.next = head;
    //     head = node;
    //     if(tail == null){
    //         tail = head;
    //     }
    //     size += 1;  
    // }

    // public void addLast(int val){
    //     Node node = new Node(val);
    //     tail.next = node;
    //     tail = node;

    //     if(tail == null){
    //         insertFirst(val);
    //         return;
    //     }
    //     size++;

    // }

    // public void atPosition(int val, int index){
    //     if(index == 0){
    //         insertFirst(val);
    //         return;
    //     }
    //     if(index == size){
    //         addLast(val);
    //         return;
    //     }
        
    //     Node temp = head;
    //     for (int i = 1; i < index; i++) {
    //         temp = temp.next;
    //     }
    //     Node node = new Node(val, temp.next);
    //     temp.next = node;

    // }

    // public int deleteFirst(){
    //     int val = head.value;
    //     head = head.next;
    //     if(head == null){
    //         tail = null;
    //     }
    //     size--;
    //     return val;
    // }
    // public int deleteLast(){
    //     if(size <= 1){
    //         return deleteFirst();
    //     }
    //     Node secondLast = get(size - 1);
    //     int val = tail.value;
    //     tail = secondLast;
    //     tail.next = null;
    //     return val;
    // }

    // public int delete(int index){
    //     if(index == 0){
    //         return deleteFirst();
    //     }
    //     if(index == size - 1){
    //         return deleteLast();
    //     }
    //     Node prev = get(index - 1);
    //     int val = prev.next.value;

    //     prev.next = prev.next.next;
    //     return val;

    // }

    // public Node find(int value){
    //     Node node = head;
    //     while(node != null){
    //         if(node.value == value){
    //             return node;
    //         }
    //         node = node.next;
    //     }

    //     return null;

    // }
    
    // public Node get(int index){
    //     Node node = head;
    //     for (int i = 1; i < index; i++) {
    //         node = node.next;
    //     }
    //     return node;

    // }


    // public void display(){
    //     Node temp = head;
    //     while(temp != null){
    //         System.out.print(temp.value + " -> ");
    //         temp = temp.next;
    //     }
    //     System.out.println("null");
    //     size++;
    //     System.out.println(size);
    // }
   
    // public Practice(){
    //     this.size = 0;
    // }
    // public class Node{
    //     private  int value;
    //     private  Node next;

    //     public Node(int value){
    //         this.value = value;
    //     }

    //     public Node(int value, Node next){
    //         this.value = value;
    //         this.next = next;
    //     }
    // }
//     public static void main(String[] args) {
//         Practice list = new Practice();
//         list.insertFirst(1);
//         list.insertFirst(2);
//         list.insertFirst(4);
//         list.display();
//         list.addLast(123);
//         list.addLast(124);
//         list.atPosition(1000, 2);
//         list.display();
//         System.out.println(list.deleteLast() + " is deleted.");
//         list.display();

//         System.out.println(list.delete(3));
//         list.display();
        
//     }
// }


public class Practice{
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

        if(head == null){
            head = newNode;
        }

    }

    public void addLast(int data){
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



    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Practice list = new Practice();
        list.addFirst(12);
        list.addFirst(11);
        list.addFirst(113);
        list.addLast(10000);
        list.display();
    }
}