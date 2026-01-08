public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if (n == 5){
            System.out.println(5);
            return;
        }
        // recursive call 
        // if you are calling a function again and again, you can treat as a separate call in the stack
        // This is called tail recursion
        // This is the last function call
        System.out.println(n);
        print(n + 1);
    }
    
    
}
