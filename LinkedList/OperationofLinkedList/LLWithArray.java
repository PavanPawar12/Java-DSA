class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LLWithArray {
    public static Node convertArr2List(int[] arr){
        if(arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i =0; i< arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args){
        int[]  arr = {12,13,14,15};
        Node head = convertArr2List(arr);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
