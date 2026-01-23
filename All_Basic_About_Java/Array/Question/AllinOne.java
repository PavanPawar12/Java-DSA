
import java.util.Arrays;

public class AllinOne {
    public static void main(String[] args) {
        /*
         * sum();
         * int[] result = maxmin();
         * System.out.println("Max: " + result[0]);
         * System.out.println("Min: " + result[1]);
         * int[] arr = {1, 3,3, 5, 7, 9};
         * System.out.println(isSortedArray(arr)); // true
         * 
         * int newlength = removeDuplicate(arr);
         * for (int i = 0; i < newlength; i++) {
         * System.out.print(arr[i] + " ");
         * }
         */

        // secondLargest();
        // moveZero();
        // longestSum();

        // missingNo();
        // System.out.println(containDuplicate());
        // System.out.println(containII());
      
        // factorial(5);

        AllinOne sol = new AllinOne();

        // int[] nums = {1,2,3,4};

        // int[] result = sol.productExceptSelf(nums);

        // // Print result
        // for (int val : result) {
        //     System.out.print(val + " ");
        // }

        // int[] nums = {1,2,3};
        // System.out.println(sol.subarraySum(nums, 3));
       int[] nums = {2,3,2};
    //    System.out.println(sol.maxProduct(nums));
       System.out.println(sol.mejorityElement(nums));
    }

    public static void sum() {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of array: " + sum);
    }

    public static int[] maxmin() {
        int[] arr = { 10, 3, 32, 12, 7 };
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        return new int[] { max, min };
    }

    public static boolean isSortedArray(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int removeDuplicate(int[] arr) {
        if (arr.length == 0){
            return 0;
        }
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }
    public static void secondLargest() {
        int[] arr = { 1, 2, 3, 54, 4, 7 };
        if(arr.length < 2){
            System.out.println("Second smallest is not possible ");
        }

        int l, sl;
        if (arr[0] > arr[1]) {
            l = arr[0];
            sl = arr[1];
        } else {
            l = arr[1];
            sl = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > l) {
                sl = l;
                l = arr[i];
            } else if (arr[i] < l && arr[i] > sl) {
                sl = arr[i];
            }
        }
        System.out.println("second largest element: " + sl);
    }

    public static void moveZero() {
        int[] arr = { 0, 1, 0, 3, 12 };

        // int pos = 0;

        // // move non-zero elements forward
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] != 0) {
        //         arr[pos] = arr[i];
        //         pos++;
        //     }
        // }

        // // fill remaining with zero
        // for (int i = pos; i < arr.length; i++) {
        //     arr[i] = 0;
        // }

        // // print result
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        //  using two pointer 
        // int j = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i] != 0){
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //         j++;
        //     }
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void longestSum(){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int currSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i] , currSum + nums[i]);

            maxSum = Math.max(maxSum, currSum);
            
        }
        System.out.println("Maximum sum : " + maxSum);
        
    }

    public static void missingNo(){
        int[] arr = {1,2,4,5};
        int n = arr.length;
        int totalSum = n * (n + 1) /2;
        int arrsum = 0;
        for(int i = 0; i < n - 1; i++) {
            arrsum += arr[i];
        }
        int missing = totalSum - arrsum;
        System.out.println("Mssing element: " + missing);

    
    }

    public static boolean  containDuplicate(){
        int[] nums = {1,2,3};
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]){
                return true;
            }
        }
        return false;
    }

    public static boolean containII(){
        int[] arr = {1,0,1,1};
        int k = 1;
        int n = arr.length;
        
        for (int i = 1; i < n -1 ; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]){
                    if(j - i <= k){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void subarray(){
        int[] arr = {1,1,1};
        int k = 1;
        int n = arr.length;

        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i + 1 ; j < n; j++) {
                sum = sum + arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        System.out.println("Sum of subarray: " + count);
    }    


    public static void factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    
    }

    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if(i != j){
                    product = product * nums[j];
                }
            }  
            answer[i] = product;    
        }
        return answer;
    }

    public int subarraySum(int[] nums, int k){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if(sum == k){
                    count++;
                }
            }
            
        }
        return count;
     }

    
    public int maxProduct(int[] nums){
        
       int maxProduct = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;

            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }

    public int mejorityElement(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count> n /2){
                return nums[i];
            }
        }
        return -1;
    }

    public int 
}
