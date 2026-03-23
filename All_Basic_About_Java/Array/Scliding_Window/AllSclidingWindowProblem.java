public class AllSclidingWindowProblem {


    public static void main(String[] args){

        // int[] arr  = {100, 42, 82, 57, 24, 112, 65};
        // int k = 3, n = arr.length;
        // int windowsum = 0;
        // int max=0;
        // for(int i = 0; i < k; i++){
        //     windowsum = windowsum + arr[i];
        // }
        // max = windowsum;
        // for(int i = 1; i <= n - k; i++){
        //     windowsum = windowsum - arr[i-1] + arr[i+k - 1];
        //     if(windowsum > max){
        //         max = windowsum;
        //     }
        // }
        // System.out.println("max sum: " + max);
        // maxSum();
        System.out.println(maxSubArray());
        System.out.println(maximum());
    }

    static void maxSum(){
        int[] arr = {2, 5, 1,1,10, 7, 10};
        int k = 14;
        int n = arr.length;
        int maxlen = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++){
                sum = sum    + arr[j];

                if(sum <= k){
                    maxlen = Math.max(maxlen, j - i + 1);
                }else{
                    break;
                }
            }       
        }
        System.out.println("MaxLen  :"+ maxlen);
    }
    
    public static int maxSubArray(){
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                if(sum > maxSum){
                    maxSum = sum;
                }

                if(sum < 0){
                    sum = 0;
                }
            }
        }
        return maxSum;
    }


    public static int maximum(){
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
         // Maximum sum
        long maxi = Long.MIN_VALUE; 
        
        // Current sum of subarray
        long sum = 0; 
        
        // Starting index of current subarray
        int start = 0; 
        
        // Indices of the maximum sum subarray
        int ansStart = -1, ansEnd = -1; 
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            
            // Update starting index if sum is reset
            if (sum == 0) {
                start = i;
            }
            
            // Add current element to the sum
            sum += nums[i]; 
            
            // Update maxi and subarray indices if current sum is greater
            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            
            // Reset sum to 0 if it becomes negative
            if (sum < 0) {
                sum = 0;
            }
        }
        
        // Printing the subarray
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");

        // Return the maximum subarray sum found
        return (int) maxi;
    }

    
}
