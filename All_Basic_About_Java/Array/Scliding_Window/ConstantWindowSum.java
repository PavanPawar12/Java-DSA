
public class ConstantWindowSum {
    public static void main(String[] args) {

        // windowSum();
        // subArray();
        // fibonacci(6);
        // System.out.println(fib(6));
        // fact(5);
        System.out.println(factorial(5));
    }

    public static void windowSum() {
        int[] arr = { -1, 2, 3, 3, 4, 5, -1 };
        int k = 4;
        int n = arr.length;

        // left and right pointer
        int l = 0;
        int r = k - 1;

        // calculate first window sum
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }

        int minSum = sum;

        // slide the window
        while (r < n - 1) {
            sum = sum - arr[l]; // remove the left element
            l++;

            r++;
            sum = sum + arr[l];

            minSum = Math.min(minSum, sum);

        }
        System.out.println("Minimum sum of subarray of size " + k + " is: " + minSum);

    }

    public static void subArray() {
        int[] arr = { 2, 5, 1, 7, 12, 10 };
        int k = 14;
        int n = arr.length;

        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];

                if (sum <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else {
                    break;
                }
            }
        }
        System.out.println("Longest subarray length: " + maxLen);
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println("Fibonnci no: " + b);
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;

        int pre2 = 0, pre1 = 1;
        for (int i = 2; i <= n; i++) {
            int curr = pre2 + pre1;
            pre2 = pre1;
            pre1 = curr;
        }
        return pre1;

    }

    public static void fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of" + n + " is: " + fact);

    }

    static int factorial(int n){
        if(n ==0 || n == 1)
            return 1;
        return n * factorial(n - 1);
        
    }
}
