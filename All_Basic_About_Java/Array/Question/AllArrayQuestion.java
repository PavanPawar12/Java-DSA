// -DSA is so easy, But it want's more time to practice: give your maximum time to solve and dry run the program and understand-------------------------------
import java.util.HashSet;
// import java.util.Arrays;
public class AllArrayQuestion {

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6 ,7};
        // call the function and stored te returned value
        // int[] result = MinMax(arr);

        // System.out.print("max:" + result[0] + " ");
        // System.out.println("min:" + result[1]);
        // reversed(arr);
        // System.out.println(sum(arr));
        // evenOddCount(arr);
        // System.out.println(isSortedArray(arr));
        // secondLargest(arr);
        // removeDuplicateFromSorted();
        
        // rotate(arr, 2);
        //   System.out.print("Rotated Array: ");
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }
        
        // frequencyBruteForce();
        // System.out.println("Hellw");
        // reverseArray();

        // revers(arr, 0, arr.length - 1);
        // printArray(arr);

        // moveZeroToEnd();
        // frequency();
    //    System.out.println(missingNumber());
        // findDuplicate();
        // maxSum();
        // System.out.println(findConsecutiveOnes());
        // System.out.println(getSingleElement());
        // System.out.println(getSingleElement1());
        // System.out.println(mejorityElement());
        // bestTimeToBuyAndSell();
        // int[] arr = {1, 0, 2, 1, 0};
        // sort_Zeros_Ones_Twos(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]  + " ");
        // }

        // int[] arr = {2,2,1,1,1,2,1,1,2};

        // int result = majorityElement(arr);
        // System.out.println(result);

        moveZeroToEnd();
    }

    public static int[] MinMax(int[] arr) {
        if (arr == null || arr.length == 0)
            return new int[] {}; // handle empty array
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
    
    public static int sum(int[] arr) {
        int n = arr.length;
        int sum =0;
        for (int i = n - 1; i >= 0; i--) {
           sum += arr[i];
        }
        return sum;
    }

    // Problem: Count even and odd numbers in an array.
    public static void evenOddCount(int[] arr){
        int evenC = 0, oddC =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                evenC++;
            }else{
                oddC++;
            }
        }
        System.out.println("Even Count: " + evenC );
        System.out.println("odd Count: " + oddC );
    }

    
    //Problem: Check if the array is sorted or not.
    public static boolean  isSortedArray(int[] arr){
        // An Arra with 0 and 1 element is always sorted
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1]){
                return false;
            }
        }
        return true;
    }
    
    //Problem: Find the second largest element.
    public static void secondLargest(int[] arr){
        int n = arr.length;
        int largest = 0;
        int secondLargest = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest element:" + secondLargest);
    }

    //Porblem: Remove duplicates from a sorted array.
    public static void removeDuplicateFromSorted(){
        int[] arr = {1,1,2,2,3};
        if(arr.length == 0) return;
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
                // arr[i] =  arr[j];
            }
        }
        int count = i +1;
        for (int k = 0; k < count; k++) {
            System.out.print(arr[k] + " ");
        }
        
    }

    //------------------------------------------------------------------------------

    //Problem: Rotate array by k positions (right side).
    public static void rotate(int[] arr, int k){
        int n = arr.length;
        if(n == 0) return;
        // if K is larger than array length, use reminder
        k = k % n;

        // reverse everything 
        revers(arr, 0, n - 1);
        //Reverse the first k element
        revers(arr, 0, k - 1);
        // Reverse the rest of the number
        revers(arr, k, n - 1);
    }
    private static void revers(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;          
        }                   
    }                       
    //-------------------------------------------------------------------------------

    //Problem: Find the frequency of each element.

    public static void frequencyBruteForce(){
        int[] arr = {1, 2, 2, 3, 1, 4, 2};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            
            boolean alreadyCounted = false;
            for(int k = 0; k < i; k++){
                if(arr[i] == arr[k]){
                    alreadyCounted = true;
                    break;
                }
            }
            if(alreadyCounted){
                continue;
            }

            int count = 0; 
            for (int j = 0; j < n; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i] + " Occurs " + count + " Times");
        }
        
    }

    //Reverse the array the array 
    public static void reverseArray(){
        int[] arr = {1,2,3,4,5};
        int start = 0, end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // for(int num: arr){
        //     System.out.print(num + " ");
        // }
        
        // System.out.println(Arrays.toString(arr));
    }    

    // Reverse using recursion
    public static void reverseUsingRecursion(int[] arr, int start, int end){
        if(start >= end) return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseUsingRecursion(arr, start + 1, end -1);

    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");   
        }
    }


    //Problem: Move all zeros to the end of array.
    public static void moveZeroToEnd(){
        int [] arr = {0, 1, 0, 3, 12};
        int j = 0; 
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        while(j < arr.length){
            arr[j] = 0;
            j++;
        }

        for (int k = 0; k <j; k++) {
            System.out.print(arr[k] + " ");
        }  
    }

    //Problem Missing number using brute force 
    public static int missingNumber(){
        int[] arr = {1,2,4,5};
        int n = arr.length;
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n - 1; j++) {
                if(arr[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found) return i;
        }
        return -1;
    }

    // Problem: find duplicate using Hashset
    public static void findDuplicate(){
        int[] arr = {1,2,3,4,2,3};
        HashSet <Integer> set = new HashSet<>();
        for(int num: arr){
            if(set.contains(num)){
                System.out.println("Duplicate : " + num);
                return;
            }
            set.add(num);
        }
    }

    public static void maxSum(){
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int windowSum = 0, maxSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum =windowSum +  arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
            // if(windowSum > maxSum){
            //     maxSum = windowSum;
            // }
        }
        System.out.println(maxSum);
    }

    public static int findConsecutiveOnes(){
        int[] arr = {1,1, 0, 1,1,1,1};
        int maxi = 0; 
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                count++;
                maxi = Math.max(maxi ,count);
            }else{
                count= 0;
            }
        }
        return maxi;
    }
    
    // Problem: Find the number that appears once, and the other numbers twice.
    public static int getSingleElement(){
        int arr[] = {4,1,2,1,2};
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            int num = arr[i];
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == num){
                    count++;
                }
            }
            if(count == 1){
                return num;
            }
        }

        return -1;
    }
    // Same optimal code of above question
    public static int getSingleElement1(){
        int[] arr = {4,1,2,1,2};
        int xor = 0;
        for(int i = 0; i < arr.length; i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }


    public static int mejorityElement(){
        int[] arr = {7, 0, 0,7,0,0,0};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count > (n / 2)){
                return arr[i];
            }
        }
        return -1;
    }

    // optimal solution of majority element in the array 
    public static int majorityElement(int[] arr){
        // int[] arr = {7,7,2,1,3,5,5,5,2,3,5,5,5,5};
        int element = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(count == 0){
                count= 1;
                element = arr[i];
            }else if(arr[i] == element){
                count++;
            }else{
                count--;
            }
        }

        int count1 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element) count1++;
        }
        if(count1 > (arr.length) / 2) return element;
        return -1;
    }
    // Problem: Best Time to Buy and Sell Stock 🔥
    public static void bestTimeToBuyAndSell(){
        int[] arr = {7, 1, 5, 3, 6, 4};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] < minPrice){
                minPrice = arr[i];
            }else{
                int price = arr[i] - minPrice;
                maxProfit = Math.max(maxProfit, price);
            }
        }
        System.out.println("Max Profit: " + maxProfit);
    }

    
    // Problem: Sort an array of 0's 1's and 2's
    public static void sort_Zeros_Ones_Twos(int[] arr){ // This is optimal solution of this question 
        
        int mid = 0, low = 0, high = arr.length -1;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
       
        
    }

}
