
import java.util.Arrays;
public class ArraySorting {

    public static void main(String[] args) {
        ArraySorting obj = new ArraySorting();
        sortArray(); // calling
        copyArray();
        maxNo();
        secondMax();
        ArraySorted();
        int[] arr = {1,2,2,3,4,5,5,9, 90,90};
        int length = obj.removeDuplicate(arr);
        System.out.println("length of array : " + length);
        System.out.print("Modifier array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        // fist and last index of position of an array
        // int[] nums = [1,2,3,4,4,4,5,6];
        // int f = findLeftBound(nums, 4);
        // int l = findRightBound(nums, 4);
        // return new int[]{f,l};

    }
    public static void sortArray(){
        int[] arr = {3,2,4,8,5,6};
        int n = arr.length ;
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("The assending array is : " + Arrays.toString(arr));
    }
    // copy array
    public static void copyArray(){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.print("Copied element: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] +  " ");
        }
    }
    public static void maxNo(){
        int[] arr = {1,2,3,6,5,8,7,9};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        System.out.println("The max value: " + max);
    }

    public static void secondMax(){
        int[] arr = {1,2,3,4,5,6};
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } 
            else if(arr[i] <  max  && arr[i] != 0){
                secondMax = max;
            }
        }
        System.out.println("The second max number is: " + secondMax);
    }

    // if array is sorted
    public static void ArraySorted(){
        int[] arr = {1,2,3,9 ,5,6};
        int n = arr.length;
        boolean isSorted = true;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                isSorted = false;
            } else{
                isSorted = true;
            }  
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }

    public static int removeDuplicate(int[] arr){
        
        int n = arr.length;

        if(n == 0){
            return 0;
        }

        int j = 0; // j will store index of unique element
        for(int i = 0; i < n - 1; i++){
            if(arr[i] != arr[i + 1]){ 
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[n - 1];
        j++;

        return j;
        // System.out.println("After array dublicate element: ");
        // for (int i = 0; i < j; i++) {
        //     System.out.print(arr[i] + " ");
        // }        
        // add last element
    }
    // search first index and last index in the array to the point 
    public  int findLeftBound(int[] nums, int target){
        int first = -1, low = 0, high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                first = mid;
                low = mid + 1;

            } else if(nums[mid] < target){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        
        return first;
    }
    public int findRightBound(int[] nums, int target){
        int last = -1, low = 0, high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                last = mid;
                low = mid + 1;

            } else if(nums[mid] < target){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
   
        return last;
    }
    
    
}
