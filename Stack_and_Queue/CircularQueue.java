public class CircularQueue {
    protected  int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
   
    public boolean isFull(){
        return size  == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty"); 
        }
        int removed = data[front];
        front = front % data.length;
        size--;
        return removed;
    }
    public int front(){
        if(isEmpty()){
            System.out.println("Queue is empty"); 
        }
        return data[front];
    }
    public void display(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty"); 
        }
        
       
        int i = front;
        do { 
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.print("END");
    }

    public static void main(String[] args){
        CircularQueue queue = new CircularQueue();
        queue.insert(12);
        queue.insert(13);
        queue.insert(14);
        queue.insert(15);
        queue.insert(16);

        queue.display();
        queue.insert(89);
        queue.display();

    }
}
