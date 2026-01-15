
import java.util.Arrays;


public class Pratice {
    public static void main(String[] args){
        // reverseNo(5);
        // oneline(5)
        // oneSecond(5);
        // bubbleSort();
        int[] arr = {2,8,7,4,5,3};
        slectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void reverseNo(int n){
       if(n == 0){
            return;
       }
       reverseNo(n - 1);
       System.out.println(n);  
    }
    static void oneSecond(int n){
       if(n == 0){
            return;
       }
       System.out.println(n);  
       reverseNo(n - 1);
       System.out.println(n);
    }

    static void bubbleSort(){
        int[] arr = {2,8,7,4,5,3};
        int n = arr.length ;
        for (int i = 0; i < n ; i++) {
            for (int j = i; j < n; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            // System.out.println(Arrays.toString(arr));
            
        }
        // System.out.println("Final Sorted Array: "+ Arrays.toString(arr));

    }
    static void slectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1 ; j < n; j++) {
                if(arr[j] < minIndex){
                    minIndex = j;
                }
            }


            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            // System.out.println(Arrays.toString(arr));
            
        }
        // System.out.println("Final Sorted Array: "+ Arrays.toString(arr));

    }
    
}
