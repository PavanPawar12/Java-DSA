
import java.util.HashSet;

class Node{

 int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    // public void display(){
    //     Node temp = head
    // }
}

public class Practice {

    public Node head;

    public class Node{
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    // public void display(){
    //     Node temp = head
    // }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            insertFirst(data);
            return;
        }
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("Lust is empty");
            return;
        }
        head = head.next;
    }

    public int count(){
        int count = 0;
         Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
            
        }
        return count;  
    }

    public void deleteLast(){
        if(head == null){
            deleteFirst();
            return;
        }
        Node temp = head;
        while(temp.next.next!= null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void insertAtIndex(int data, int index){
        Node newNode = new Node(data);
        if(index == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
      
        Node temp = head;
        for(int i = 1; i < index -1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;   
    }

    public void deleteAtIndex(int index){
        Node temp = head;
        for(int i = 1; i < index -1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
       
    }       

    public boolean search(int data){
        Node temp = head;
        while(temp != null ){
            if(temp.data== data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public int middleElement(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
       return slow.data;
    }
    public void reverse(){
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


    // this below code is excuted in vs code as i written here 
    public boolean hasCycle(){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
            
        }
        return false;
    }

    // Remove duplicate element
    public void removeDuplicate(){
        Node current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
    }
    // remove duplicate from unsorted list 
    public void removeDuplicateUnsorted(){
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node prev = null;
        while(current != null){
            if(set.contains(current.data)){
                prev.next = current.next;
            }else{
                set.add(current.data);
                prev = current;
            }
            current = current.next;
        }

    }
    
    public static void main(String[] args){
       

        Practice list = new Practice();
        
        list.insertLast(3);
        list.insertLast(13);
        list.insertLast(4);
        list.insertLast(13);
        list.insertLast(7);
        list.insertLast(6);
        list.display();
        // list.removeDuplicate();
        list.removeDuplicateUnsorted();
        list.display();

    

        // list.display();
        // list.insertAtIndex(100, 3);
        // list.display();
        // list.deleteAtIndex(3);
        // System.out.println(list.search(17));
        // System.out.println(list.middleElement());
        // list.display();
        // list.reverse();
        // list.display();


        // list.insertLast(15);
        // list.display();
        // list.deleteFirst();
        // list.display();
        // list.deleteLast();
        // System.out.println("total Node: "+list.count());
        // list.display();
        // list.

        // System.out.print(first.data + "->");
        // System.out.print(first.next.data+ "->");
        // System.out.print(first.next.next.data+ "->");
        // System.out.print("None");
    }
}
