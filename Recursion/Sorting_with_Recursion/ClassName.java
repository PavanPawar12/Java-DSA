public class ClassName {
    public static void main(String[] args) {
        
    }

    static void bubbleSort(int[] arr, int s, int e){
        int n = arr.length;
        if(s > e){
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
             if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
             }   
            }
        }
        
    }
}