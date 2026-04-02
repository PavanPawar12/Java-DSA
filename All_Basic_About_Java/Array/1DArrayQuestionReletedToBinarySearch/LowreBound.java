import java.util.Scanner;

public class LowreBound {
    public static void main(String[] args){
      
        System.out.println(lowerBound());
    }
    public static int lowerBound(){   // this is not optimise solution 
        // int[] arr = {3,5,8,15,19};
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the Nuber that you want to contain in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }  
        int target = 9;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > target){
                
                return i;
            }
        }

        return arr.length;
    }


    // for optimize solution we need to do using binary search 

    public static int lowerBound1(){
        int[] arr = {3,5,8,15,19};
        int target = 9;
        int low = 0, high= arr.length - 1;
        int ans = arr.length;

        while(low < high){
            int mid = low + (high - low) / 2;
            if(arr[mid] > target){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }

        }
        return ans;

    }
}
