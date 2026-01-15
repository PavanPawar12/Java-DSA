public class MaxSumArray {
    public static void main(String[] args) {
        // int[] arr = {-1, 2,3,3,4,5,1};
        int[] arr = {2,5,1,7,10};
        System.out.println(arraySize(arr, 14));

    }
    static int maxsumarray(int[] arr, int k){
        int n = arr.length;
        int l = 0;
        int r = k - 1;
        int sum = 0;
        for (int i = l; i < r; i++) {
            while(r < n -1 ){ // if you do (r < n) i become outof bound 
                sum = sum - arr[l];
                l++;
                sum = sum + arr[r];
                r++;
            }
        }
        return sum;
        
    }

    static int arraySize(int[] arr, int k){
        int n = arr.length;
        int maxLen = 0;
        for (int i = 0; i <n -1 ; i++) {
            int sum = 0;
            for (int j = i; j < n- 1; j++) {
                sum = sum + arr[j];
                if(sum <= k){
                    maxLen = Math.max(maxLen, j - i + 1);
                }else if(sum > k){
                    break;
                }
            }
            System.out.println("Total sum = " + sum);
        }
        return maxLen;
        // System.out.println("Maxlength: "+ maxLen);
    }
}