// import java.util.Arrays;
import java.util.HashSet;


public class SecondAllInOne{
    public static void main(String[] args){
        // System.out.println(isSortedArray());
         int[] arr = {1,5,4,7,9,8};
        // System.out.println(Arrays.toString(removeDuplicate(arr)));
       secondLargest(arr);
    removeDuplicate1();
    // removeDuplicate2();
    }
    static boolean isSortedArray(){
        int[] arr = {1,2,2,3,3,4};
        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= arr[i - 1]){
                
            }else{
                return false;
            }
        }
        return true;
    }

    public static int[] removeDuplicate(int[] arr){
       
        int i = 0; 
        for(int j = 1; j < arr.length;j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        int [] result = new int[i+1];
        for(int k = 0; k <= i; k++){
            result[k] = arr[k];
        }
        return result;
    }
    public static void secondLargest(int[] arr){
        int largest = arr[0];
        int slargest = arr[0];
        
        
        for(int i = 1; i< arr.length; i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > slargest && arr[i] != largest){
                slargest = arr[i];
            }
        }
        System.out.println(slargest);
    }

    public static void removeDuplicate1(){
        int[] arr  = {1,2,5,4,3,5,56};
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr){
            set.add(num);
        }
        System.out.println(set);
    }

    
}