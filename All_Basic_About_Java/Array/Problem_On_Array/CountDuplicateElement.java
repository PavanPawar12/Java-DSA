public class CountDuplicateElement{
    public static void main(String[] args) {
       System.out.println(fibo(5));
    }
    public static void print1(int  n){
        if(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print1(n + 1);
        System.out.println(n);
    }
    public static int fibo(int n){
        if(n  < 2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}