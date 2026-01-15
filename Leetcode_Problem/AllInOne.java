
import java.util.HashMap;



public class AllInOne {
    public static void main(String[] args) {
        int[] arr = {2,7,5,15};
        int k = 9;
        int[] result = twoSum(arr, k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        subarraySum();
        
    }
    public static int[] twoSum(int[] arr, int k){
       
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
               
                if(arr[i] + arr[j] == k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
        
    }

    public static int[] useHashSum(){
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr  = {2,7,9,15};
        int k = 9;
        for (int i = 0; i < arr.length; i++) {
            int complement = k- arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[] {};
    }

    public static void subarraySum(){
        int[] arr = {1,2,3,4};
        int k = 3;
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int sum  = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        System.out.println("Total count: " + count);
    }
}
