
import javax.swing.text.DefaultStyledDocument;

public class RotatedBinarySearch {
    public static void main(String[] args){

    }
    static int search(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid  = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            // if(target >= arr[start] && target <= arr[mid]){
            //     end = mid - 1;
            // }else{
            //     start = mid + 1;
            // }
            if(target >= arr[start] && target <= arr[mid]){
               return search(arr, target, 0, mid - 1); 
            }else{
                return search(arr, target, mid+1, end); 
            }
        }else{
           
        }

    }
}
