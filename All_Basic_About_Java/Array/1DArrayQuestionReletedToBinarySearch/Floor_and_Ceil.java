/*
Given a sorted array nums and an integer x. 
Find the floor and ceil of x in nums. 
The floor of x is the largest element in the array which is smaller than or equal to x. 
The ceiling of x is the smallest element in the array greater than or equal to x. 
If no floor or ceil exists, output -1.
*/
public class Floor_and_Ceil {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int target = 5;
        Floor_and_Ceil obj = new Floor_and_Ceil();
        int[] result = obj.getFloorAndCeil(arr, target);
        System.out.println("The Floor and Ceil are: " + result[0] + " " + result[1]);
    }
    public  int findFloor(int[] arr, int target) {
        int low = 0, high= arr.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] <= target){
                ans = arr[mid];
                low = mid + 1;
            }else{
                high = mid - 1;
            }
            
        }
        return ans;
        
    }
    public  int findCeil(int[] arr, int target) {
        int low = 0, high= arr.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] >= target){
                ans = arr[mid];
                high =  mid - 1;
            }else{
                low = mid + 1;
            }
            
        }
        return ans;
    }

    public int[] getFloorAndCeil(int[] arr, int target){
        int f = findFloor(arr, target);
        int c = findCeil(arr, target);
        return new int[]{f, c};
    }
}
