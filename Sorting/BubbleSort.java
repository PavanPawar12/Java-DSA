
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {1,8,5,9,2,6};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        fact(5);
    }  
    
    static void fact(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }


    
}
