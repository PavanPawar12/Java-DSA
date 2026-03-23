import java.util.ArrayDeque;
import java.util.Deque;
public class InBuiltExample {
    public static void main(String[] args){
        // Stack<Integer> stack = new Stack<>();
        // stack.push(34);
        // stack.push(30);
        // stack.push(31);
        // stack.push(32);
        // System.out.println(stack.pop());

    //    Queue<Integer> queue = new LinkedList<>();
    //    queue.add(23);
    //    queue.add(33);
    //    queue.add(43);
    //    queue.add(53);
    //    queue.add(73);
    //    System.out.println(queue.peek());
    //    System.out.println(queue.remove());
    //    System.out.println(queue.remove());

    Deque<Integer> deque = new ArrayDeque<>();
    deque.add(23);    
    deque.add(24);    
    deque.addLast(100);   
    deque.removeFirst();    //etc etc 
    
    }
}
