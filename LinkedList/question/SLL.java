public class SLL {

    Node head;
    int size;

    public SLL() {
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
            this.next = next;
            this.prev = prev;
            
        }
    }
    public void insertFirst(int val){
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertLast(int val){
        Node newNode = new Node(val);
        if(head == null){
            insertFirst(val);
            return;
        }
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }
    public void insertAtIndex(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index -1; i++){
            temp = temp.next;   
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;

    }
    
    public void secondLastNode(){
        if(head == null || head.next == null){
            System.out.println("Does not exist");
            return;
        }
        Node temp = head;
        while(temp.next.next.next!= null){
            temp = temp.next;
        }
        System.out.println(temp.val);
        
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public boolean isPalindrom(){
        if(head == null || head.next == null){
            return true;
        }
        Node slow = head;
        Node fast = head;
        // fins middle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse second half 
        Node prev =null;
        Node current = slow;
        while(current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node first = head;
        Node second = prev;
        while(second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    } 

    // merge two sorted list 

    public  Node merge(Node head1 , Node head2){
        Node dummy = new Node(-1);
        Node current = dummy;
        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                current.next = head1;
                head1 =head1.next;
            }else{
                current.next = head2;
                head2 =head2.next;

            }
            current = current.next;
        }
        if(head1 !=null){
            current.next = head1;
        }
        if(head2 != null){
            current.next = head2;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        SLL list1 = new SLL();
        // list.insertFirst(1);
        // list.insertFirst(2);
        // list.insertFirst(3);
        // list.insertFirst(4);
        // list.insertLast(10);
        // list.display();
        // // list.insertAtIndex(12, 3);
        // // list.secondLastNode();
        // System.out.println(list.isPalindrom());
        // list.display();

        SLL list2 = new SLL();
        // first sorted list
    list1.insertLast(1);
    list1.insertLast(3);
    list1.insertLast(5);

    // second sorted list
    list2.insertLast(2);
    list2.insertLast(4);
    list2.insertLast(6);
    Node mergedHead = list1.merge(list1.head, list2.head);

    // print merged list
    Node temp = mergedHead;
 
    while(temp != null){
        System.out.print(temp.val + " -> ");
        temp = temp.next;
    }
    System.out.println("END");
        
    }
}
