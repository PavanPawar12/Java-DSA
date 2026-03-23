public class SclidingWindow{
    public static void main(String[] args){
        // allSclideSum();
        // maxSum();
        // smallestSubarray();
        // max();
        System.out.println("Missing Number:" + missingNO());
        
    }
    public static void allSclideSum(){
        int[] arr  = {100, 42, 82, 57, 24, 112, 65};
        int n = arr.length;
        int k = 3;
        int windowSum = 0; 
        for(int i = 0; i < k; i++){
            windowSum = windowSum + arr[i];
        }
        System.out.println("total number of sum: "+ windowSum);
        for(int i = 1; i <= n - k; i++){
            windowSum = windowSum - arr[i - 1] + arr[i+ k -1];
            System.out.println("total number of sum: "+ windowSum);
        }
    }
    public static void maxSum(){
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        int n = arr.length;
        int avg = 0;
        int windowSum = 0, max = 0;
        for(int i = 0; i < k; i++){
            windowSum = windowSum + arr[i];
        }
        max = windowSum;
        for(int i = 1; i <= n - k; i++){
            windowSum = windowSum - arr[i - 1] + arr[i + k - 1];
            if(windowSum > max){
                max = windowSum;
            }
            avg = max/k;
        }
        System.out.println(max);
        System.out.println("Average of max :  " + avg);
        
    }
    public static void max(){
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int k = 3;
        int windowSum = 0, maxSum = 0, avg = 0;
        for(int i = 0; i < k; i++){
            windowSum = windowSum + arr[i];
        } 
        maxSum = windowSum;
        for(int i= k; i < n; i++){
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum , windowSum); 
            avg = maxSum/k;                                                                                                                                                                 
        }
        System.out.println("Max Sum : " + maxSum);
        System.out.println("Average of maxSum: " + avg);
    }

    public static int missingNO(){
        int[] arr = {1,2,3,5};
        int n = 5;
        int sum = n * (n + 1)/2;
        int total = 0;

        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        return sum-total;
        

    }
}