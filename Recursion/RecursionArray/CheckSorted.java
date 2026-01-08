

public class CheckSorted {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(arrSorted(arr, 0));
    }

    static boolean  arrSorted(int[] arr, int index){
        // base condition 
        if(index == arr.length-1){
            return true;
        }
        // if(arr[index] > arr[index + 1]){
        //     return false;
        // }

        return arr[index] < arr[index + 1] && arrSorted(arr, index + 1);
    }

}
