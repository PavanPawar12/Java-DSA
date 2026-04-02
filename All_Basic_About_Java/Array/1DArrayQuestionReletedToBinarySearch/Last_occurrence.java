

/*
Problem Statement: Given a sorted array of N integers, write a program to find the index of the last occurrence of the target key.
If the target is not found then return -1.
 Note: Consider 0 based indexing
*/
public class Last_occurrence{
    public static void main(String[] args) {
        int[] arr = {3, 4, 13, 13, 13, 20, 40};
        int x = 13;
        System.out.println(lastOccurrence1(arr, x));
    }    

    public static int lastOccurrence(int[] arr, int x){
        int n = arr.length - 1;
        for(int i = n; i > 0; i--){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    // we need to minimize the time to run this code using binary search 
    
    public static int lastOccurrence1(int[] arr, int x){
        int low = 0, high = arr.length - 1;
        int result = -1;
        while(low <= high){
            int mid = low + (high -low) / 2; 
            if(arr[mid] == x){
                result = mid;
                low = mid + 1;
            }else if(arr[mid] > x){
                high = mid - 1;
            }else{
                low = mid  + 1;
            }
        }

        return result;
        
    }
}
