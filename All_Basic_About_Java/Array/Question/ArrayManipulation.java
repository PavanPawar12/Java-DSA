
import java.util.ArrayList;
import java.util.List;

public class ArrayManipulation{
    public static void main(String[] args) {
        int[] arr = {1, 2, -4, -5};
        int[] result = arrayManipulation(arr, arr.length );
        for(int num: result){
            System.out.print(num + " ");
        }
    }

    public static int[] arrayManipulation(int[] arr, int n){
        List<Integer> pos = new ArrayList<Integer>();
        List<Integer> neg = new ArrayList<Integer>();

        for(int i =0; i < arr.length; i++){
            if(arr[i] > 0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }

        for(int i = 0; i < n / 2; i++){
            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i);
        }
        return arr;

    }
}