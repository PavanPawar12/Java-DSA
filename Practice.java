
import java.util.*;
public class Practice {
    public static void main(String[] args) {
        // int[] arr = {2, 5, 1, 3, 9};
        // System.out.println(SLargestElement(arr, arr.length));

        // int[] arr = {1, 2, 4, 7, 7, 5};
        // int[] ans = LargestSLargest(arr, arr.length);
        // System.out.println("Second Largest: " + ans[0]);
        // System.out.println("Largest: " + ans[1]);

        // getElements();
        // SLargestSSmallest();
        // int[] result = reverseArray();
        // for(int i = 0; i < result.length; i++){
        //     System.out.print(result[i] + " ");
        // }
        reverseArrayTwoPointer();
    }
    // function to find the SLargest element in the array 
    public static int SLargestElement(int[] arr, int n){
        int min = arr[0];  // initialize minimum element with the first element
        // Iterate through the array to find the SLargest element
        for(int i = 0; i < n; i++){
            if(min > arr[i]){
                min = arr[i]; // if the current element is smaller that min, update min.
            }
        }
        return min; // return the SLargest element found
    }

    public static int[] LargestSLargest(int[] arr, int n){
        int SLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i = 1; i < n; i++){
            if(arr[i] > largest){
                SLargest = largest;
                largest = arr[i];
            }else if(arr[i] >=  SLargest && arr[i] != largest){
                SLargest = arr[i];
            }
        }
        return new int[]{SLargest, largest};  
    }
    
    public static void  SLargestSSmallest(){
        int[] arr = {1, 2, 4, 6, 7, 5};
        int n = arr.length;
        int small = Integer.MAX_VALUE;
        int Ssmall = Integer.MAX_VALUE;

        int large = Integer.MIN_VALUE;
        int Slarge = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] < small){
                Ssmall = small;
                small = arr[i];
            }else if(arr[i] < Ssmall && arr[i]!= small){
                Ssmall = arr[i];
            }

            if(arr[i] > large){
                Slarge = large;
                large = arr[i];
            }else if(arr[i] < Slarge && arr[i] != large ){
                Slarge = arr[i];
            }

        }
        System.out.println(Ssmall);
        System.out.println(Slarge);
    }


    public static void getElements(){
        int[] arr = {1, 2, 4, 6, 7, 5};
        int n = arr.length;
        // when array has less than two element
        if(n == 0 || n == 1){
            System.out.println(-1 + " " + -1);
            return;

        }
        // sort the array easily to find the second largest and second smallest element
        Arrays.sort(arr);
        int Ssmall  = arr[1];

        //  second largest element is at index n - 2 after sorting
        int SLargest = arr[n - 2];

        System.out.println("second smallest: "+ Ssmall);
        System.out.println( "Second Largest : " + SLargest);

    }


    public static int[] reverseArray(){
        int[] arr = {1,2,3,4,5};
        int  n = arr.length;
        // create a new array of same size to store reversed elements
        int[] ans  = new int[n];

        // loop to fill ans[] from the back of arr[]
        for(int i = 0; i < n; i++){
            ans[i] = arr[n - 1 - i];
        }
        return ans;
    }
    
    
    public static void reverseArrayTwoPointer(){
        int[] arr = {1,2,3,4,5};
       
        int start =0; 
        int end = arr.length - 1;
        while( start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}