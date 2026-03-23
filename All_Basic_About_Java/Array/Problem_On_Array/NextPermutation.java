public class NextPermutation {
    public static void main(String[] args) {
    
       NextPermutation obj = new NextPermutation();
       
       int[] arr = {1,2,3,5,4};
       obj.NextPermutation(arr);
        for(int num: arr){
            System.out.print(num);
        }
    }

    public void NextPermutation(int[] arr){
        int n = arr.length;
        int pivot = -1;
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] < arr[i + 1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            reverse(arr, 0, n - 1);
            return;
        }
        for(int i = n -1;i > pivot; i--){
            if(arr[i] > arr[pivot]){
                swap(arr, i , pivot);
                return;
            }


        }

        // stape 3: riverse pivot+1 to n -1
        reverse(arr, pivot+1, n-1);
    }
    private void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

   
}