import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        // stack.push(12);
        // stack.push(12);
        // stack.push(13);
        // stack.push(14);
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        Queue<Integer> q = new ArrayDeque<>();
        q.add(12);
        q.add(32);
        q.add(42);
        q.add(52);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.print(q.remove());
    }
}
