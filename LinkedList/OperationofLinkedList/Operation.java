
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

// public class Operation {

//     private Node head;
//     private Node tail;

//     private int size;

//     public Operation() {
//         this.size = 0;
//     }

//     private class Node {
//         private int value;
//         private Node next;

//         public Node(int value) {
//             this.value = value;
//         }

//         public Node(int value, Node next) {
//             this.value = value;
//             this.next = next;
//         }

//     }

//     // while loop programming language

//     public void insertFirst(int val) {
//         Node node = new Node(val);
//         node.next = head;
//         head = node;
//         if(tail == null){
//             tail = head;
//         }
//         size++;
//     }

//     public void insertLast(int value){  // time complexity of this is : constant 
//         if (tail == null){
//             insertFirst(value);
//             return;
//         }
//         Node node = new Node(value);
//         tail.next = node;
//         tail = node;
//         size++;
//     }

//     public void insert(int val, int index){
//         if(index == 0){
//             insertFirst(val);
//             return;
//         }
//         if(index == size){
//             insertLast(val);
//             return;
//         }

//         Node temp = head;
//         for (int i = 1; i < index; i++) {
//             temp = temp.next;
//         }
//         Node node = new Node(val, temp.next);
//         temp.next = node;
//         size++;

//     }

    
//     public void display(){
//         Node temp = head;
//         while(temp !=  null){
//             System.out.print(temp.value + " -> ");
//             temp = temp.next;
//         }

//         System.out.println("null");
//     }


//     public int deleteFirst(){
//         int val = head.value;
//         head = head.next;
//         if(head == null){
//             tail = null;
//         }
//         size--;
//         return val;
//     }

//     // delete at perticular index
//     public int delete(int index){
//         if(index == 0){
//             return deleteFirst();
//         }
//         if(index == size - 1){
//            return deleteLast();
//         }
        
//         Node prev = get(index - 1);
//         int val = prev.next.value;
//         prev.next = prev.next.next;

//         return val;
//     }
//     public int deleteLast(){
//         if(size <= 1){
//             return deleteFirst();
//         }

//         Node secondLast = get(size - 2);
//         int val = tail.value;
//         tail = secondLast;
//         tail.next = null;
//         return val;

//     }
//     public Node find(int value){
//         Node node = head;
//         while(node != null){
//             if(node.value == value){
//                 return node;
//             }
//             node = node.next;
//         }
//         return null;
//     }
//     public Node get(int index){
//         Node node = head;
//         for (int i = 0; i < index; i++) {
//             node = node.next;
//         }
//         return node;
//     }

//     public static void main(String[] args) {
//         Operation list = new Operation();
        
//         list.insertFirst(24);
//         list.insertFirst(25);
//         list.insertFirst(26);
//         list.insertLast(23);
//         list.insertLast(199);
//         list.display();
//         list.insert(123, 2);
//         System.out.println(list.deleteFirst());
//         list.display();
//         System.out.println("last Deleted:  "+ list.deleteLast());
//         list.display();
//         System.out.println("Delete value : "+ list.delete(2));
//         list.display();
//     }
// }

public class Operation {
    private Node head;
    private Node tail;
    public int size;

    public Operation() {
        this.size = 0;
    }
    
    public class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
        Node(int val, Node next, Node prev){
            this.val = val;
            this.next = null;
            this.prev = prev;
        }

        Node(int value, Node next) {
            this.val = value;
            this.next = next;
        }
    }
    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next= head;
        head = newNode;
        size++;
    }
    public void deleteFirst(){
        if(head == null) return;
        head = head.next;
    }

    public void display(){
        Node temp = head;
        
        while (temp != null) { 
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("Null");

    }
    
    public void insertLast(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!= null) { 
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    public void insertAtPosition(int val, int position){
        Node newNode = new Node(val);
        if(position == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        
        Node temp = head;
        for(int i = 0; i < position - 1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void deleteLast(){
        if(head == null || head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteByValue(int key){
        if(head == null) return;

        // if(head.val = key){
        //     head = head.next;
        //     return;
        // }
        
        if(head.val == key){
            head = head.next;
            return;
        }
        Node temp = head;
        if(temp.next != null && temp.next.val != key){
            temp = temp.next;
        }

        if(temp.next != null){
            temp.next = temp.next.next;             
        }
    }

    public boolean search(int key){
        Node temp = head;
        while( temp!= null){
            if(temp.val == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int count(){
        int count= 0; 
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void reverse(){
        Node next = null;
        Node current = head;
        Node prev = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = prev;
            
        }
        head = prev;
    }

    // -------------------Problem Statement---------------------------

    public void removeDuplicate(){
        Node node = head;
        while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
                size--;
            } else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    // insert using recurion
    public void insertRec(int val,int index){
        head = insertRec(val, index, head);
    } 

    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
            
        }
        
        node.next = insertRec(val, index-1, node.next);
        System.out.println("Inserting: " + val);
        return node;

    }

    // remove duplicate from solted list
    public Node removeDuplicate1(){
        if(head == null){
            return head;
        }
        Node current = head;
        while(current !=  null && current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }

        return head;
    }



    // Delete Node in a list
    public void deleteNode(Node node){
        node.val = node.next.val;
        node.next = node.next.next;
    }


    // Merge two sorted list
    // public static Practice merge(Practice  first, Practice second){
    //     Node head1 = first.head;
    //     Node head2 = second.head;
    // }

    // Linked list cycle
   
    public boolean hasCyle(Node head){
        if(head == null || head.next == null){
            return false;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;  
    }
    
    public Node  reverse1(){
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public void reverse2(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }



    public static void main(String[] args) {
        Operation list = new Operation();
        // list.insertFirst(12);
        // list.insertFirst(13);
        // list.insertLast(14);
        // list.insertLast(16);
        // list.insertLast(16);
        // list.insertLast(16);
        // list.insertLast(18);
        // list.insertLast(17);
        // list.insertLast(19);
        // list.insertLast(20);
        // list.insertAtPosition(17, 3);
        // list.deleteFirst();
        // list.display();
        // list.deleteLast();
        // list.display();
        // list.deleteByValue(13);
        // System.out.println(list.search(12));
        // System.out.println("Total count of list is: " + list.count());
        // list.display();
        
        // // list.reverse();
        // list.removeDuplicate();
        // list.display();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(5);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.display();
        list.insertRec(23, 2);
        list.display();
        list.removeDuplicate1();
        list.display();  
        list.reverse1();
        list.display();
    }
}