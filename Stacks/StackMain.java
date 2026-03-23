package Stacks;

public class StackMain {
    public static void main(String[] args) throws StackException{
        CustomStacks stack = new CustomStacks(5);
            stack.push(34);
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(50);

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());

    }
}
