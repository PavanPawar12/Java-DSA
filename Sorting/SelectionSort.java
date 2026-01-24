
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
