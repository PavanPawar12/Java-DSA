
public class UpperBound {
    public static void main(String[] args){
        System.out.println(upperBound1());
    }

    public static int upperBound(){
        int[] arr = {1,2,2,3};
        int target = 2;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > target){
                return i;
            }
        }

        return arr.length;
    }

    public static int upperBound1(){
        int[] arr = {3,5,8,15,19};
        int target = 90;
        int low = 0, high= arr.length - 1;
        int ans = arr.length;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] > target){
                ans = mid;
                high =  mid - 1;
            }else{
                low = mid + 1;
            }

        }
        return ans;
    }
}
