
public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; 

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
            
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // copy the current items in the new array 
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }

        data = temp;
    }
    
    
    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
        
    }
    public int size(){
        return size;
    }
    private boolean isFull() {
        return size == data.length;
    }


    public void set(int index, int value){
        data[index] = value;
    }

    public void setOption(int index, int data){
       
    }
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(9);
        System.out.println(list);
    }
    
}
