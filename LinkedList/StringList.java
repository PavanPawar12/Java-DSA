// // class StringList {
// //     Node head;
// //     class Node{
// //         String data;
// //         Node next;

// //         Node(String data){
// //             this.data = data;
// //             this.next = null;
// //         }
// // //operation --->  add, print . delete , size check
// //     }
// //     // add---> first, last
// //     public void addFirst(String data){
// //         Node newNode = new Node(data);
// //         if(head == null){
// //             head = newNode;
// //             return;
// //         }

// //         newNode.next = head;
// //         head = newNode;

// //     }
// //     //add list
// //     public void addLast(String data){
// //         Node newNode = new Node(data);
// //         if(head == null){
// //             head = newNode;
// //             return;
// //         }

// //         Node currNode = head;
// //         while(currNode.next!= null){
// //             currNode = currNode.next;
// //         }

// //         currNode.next = newNode;
// //     }

// //     public void printList(){

// //         if(head == null){
// //             System.out.println("List is empty");
// //         }
// //         Node currNode = head;
// //         while(currNode!= null){
// //             System.out.print(currNode.data + " -> ");
// //             currNode = currNode.next;
// //         }
// //         System.out.println("NULL");
        
// //     }

// //     public static void main(String[] args) {
// //         StringList list = new StringList();
// //         list.addFirst("a");
// //         list.addFirst("is");
// //         list.printList();
// //         list.addLast("list");
// //         list.printList();
// //     }
// // }


// public class StringList {
//     Node head;

//     class Node{
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

//     public void addLast(int data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while(temp.next != null){
//             temp = temp.next;
//         }
//         temp.next = newNode;

//     }
//     public void display(){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         StringList list = new StringList();
//         list.addFirst(12);
//         list.addFirst(11);
//         list.addLast(13);
//         list.addLast(14);
//         list.display();
        
//     }
// } 

public class StringList {

    private Node head;
    private Node tail;

    private int size;

    public StringList(){
        this.size = 0;
    }

    public void inserFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }



    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        StringList list = new StringList();
        list.inserFirst(12);
        list.inserFirst(24);
        list.inserFirst(36);
        list.display();
    }
}