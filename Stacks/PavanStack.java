


public class PavanStack {
    int[] stack;
    int top;
    int size;

    public PavanStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int value){
        if(top == size -1){
            System.out.println("Stack overflow");
            return;

        }
        top++;
        stack[top] = value;
    }
    
    public int pop(){
        if(top == -1){
            System.out.println("stack underflow");
            return - 1;
        }
        int removed = stack[top];
        top--;
        return removed;
    }
    public int peek(){
        if(top == -1){
            System.out.println("stack is empty");
            return - 1;
        }
        return stack[top];
    }
    public void display(){
        for(int i = top; i >= 0; i--){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args){
        PavanStack stack = new PavanStack(5);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        stack.push(17);

        stack.display();
        // System.out.println(stack.pop());
        stack.display();
     
        System.out.println(stack.peek());
        stack.display();
        

    }
}
