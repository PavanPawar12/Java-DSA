
public class Fibo {
    
    static int fibo(int n) {
        // base condition
        if (n < 2) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    static void printnum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printnum(n - 1);
        System.out.println(n);
    }

    static int fact(int n) {
        if (n < 2) {
            return 1;

        }
        return n * fact(n - 1);
    }

    static int sum(int n) {

        if (n % 10 == n) {
            return n;
        }

        return (n % 10) + sum(n / 10);
    }

    static int sum = 0;

    static void rev(int n) {

        if (n % 10 == 0) {
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        rev(n / 10);
    }

    private static int rev1(int n) {
        int digits = (int) (Math.log10(n) + 1);
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    static boolean palin(int n) {
        return (n == rev1(n));
    }

    static boolean pal(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;

        }
        return original == sum;
    }

    static int count(int n){
        return helpers(n, 0);
    }
    private static  int helpers(int n, int c){ // but it is not giving me a currect answer
        if(n == 0){
            return c;
        }
        int rem = n % 10;
        if( rem == 0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }

    public static void main(String[] args) {
        // int ans = fibo(50);
        // System.out.println(ans);
        // System.out.println(fact(5));
        // int result = sum(123456);
        // System.out.println(result);
        // System.out.println(printnum(5));

        // //printnum(4);
        // System.out.println(rev1(1234));
        // System.out.println(palin(12332));
        // System.out.println(pal(12321));
        System.out.println(count(30204120));

    }


}
