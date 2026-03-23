public class MergeSort {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        System.out.println(binary(arr,3));
    }

    public static int binary(int[] arr , int target){
        int low = 0; 
        int high = arr.length -1 ;
        while(low <= high){
            int mid =low + (low - high);

            if(target == arr[mid]){
                return mid;
            }else if(arr[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
