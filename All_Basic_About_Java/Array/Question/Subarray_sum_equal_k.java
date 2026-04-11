/*
Given an array of integers nums and an integer k, return 
the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of
elements within an array.

Input: nums = [1,1,1], k = 2
Output: 2

Input: nums = [1,2,3], k = 3
Output: 2
*/

public class Subarray_sum_equal_k {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        int k = 3;
        int maxLen = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0; 
            for(int j = i; j < arr.length; j++){
                sum += arr[j];

                if(sum == k){
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        System.out.println(maxLen);

    }
}
