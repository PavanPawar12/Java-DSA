

public class StackMain {
    public static void main(String[] args) {

        try {
            CustomStack stack = new CustomStack(5);
            stack.push(34);
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(50);
            stack.push(90);

            System.out.println("Pop: " + stack.pop());
            System.out.println("Peek: " + stack.peek());

        } catch (StackException e) {
            System.out.println(e.getMessage());
        }
    }
}