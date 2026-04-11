public class CustomQueue{
    protected  int[] data;
    int end = 0;
    private static final int DEFAULT_SIZE = 10;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }
    public boolean insert(int item){
        if(isFull()){
            System.out.println("Stack is full !!");
            return false;
        }
        data[end++] = item;
        return true;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty"); 
        }
        int removed = data[0];

        // shift all element to left
        for(int i = 1; i < end; i++){
            data[i - 1] = data[i];
        }
        end--;
        return removed;

    }
    public boolean isFull(){
        return end  == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public int front(){
        if(isEmpty()){
            System.out.println("Queue is empty"); 
        }
        return data[0];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty"); 
            return;
        }
        for (int i = 0; i < end; i++) {
        System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
        
    }


    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(4);
        queue.insert(12);
        queue.insert(13);
        queue.insert(14);
        queue.insert(15);
        // queue.display();
        // queue.remove();
        queue.display();
        System.out.println(queue.front());
        queue.remove();
        queue.display();
        


    }
}

