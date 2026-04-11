
import java.util.ArrayList;
import java.util.Collections;


/*
Given an integer array nums, return a list of all the leaders in the array.

A leader in an array is an element whose value is strictly greater than 
all elements to its right in the given array. 
The rightmost element is always a leader.
The elements in the leader array must appear in the order they appear in the nums array.

Input: nums = [1, 2, 5, 3, 1, 2]
Output: [5, 3, 2]

Input: nums = [-3, 4, 5, 1, -4, -5]
Output: [5, 1, -4, -5]
*/

//🚀 Optimized Approach (Better Solution) TC=O(n);
public class Leader_In_Array {
    public static void main(String[] args){
        int[] arr = {1, 2, 5, 3, 1, 2};

        ArrayList<Integer> list = new ArrayList<>();
        int maxFromright = arr[arr.length - 1];
        list.add(maxFromright);

        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] > maxFromright){
                maxFromright = arr[i];
                list.add(arr[i]);
            }

        }
        Collections.reverse(list);
        
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
        }

        // We can also print like this:
        // for(int num: list){
        //     System.out.println(num);
        // }
    }   
}
