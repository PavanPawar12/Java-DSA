
//Selection sort
/*
Selection sort is a sorting technique that repeatedly finds the minimum element from the 
unsorted portion of the array and places it at the beginning.

Time Complexity: O(n²) (best, average, worst)
Space Complexity: O(1)
*/

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        selectionSort();
    }

    static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);

            swap(arr, maxIndex, last);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
    }

    static void selectionSort(){
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;
        for (int i = 0; i < n -1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
        int temp = arr[minIndex];
        arr[minIndex] =  arr[i];
        arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
