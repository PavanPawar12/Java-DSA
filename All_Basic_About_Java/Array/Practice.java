import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        // int[] arr = { 10, 2, 3, 4, 5 };
        // int max = arr[0];
        // int min = arr[0];

        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] > max) {
        //         max = arr[i];
        //     }
        //     if (arr[i] < min) {
        //         min = arr[i];
        //     }
        // }
        // System.out.println("Max: " + max);
        // System.out.println("min: " + min);

        // int[] array = { 1, 2, 3, 4, 5 };
        // sum(array);

        // // StringProblem();
        // // twoPointer();
        // twoPointerSum();
        // twopointerwithsum();
        // string();
        // sum();
        // sclidWindow();
        // windowSumlesserNumber(); 
        int[] arr = {1,2,30,4};
        System.out.println(isArraySorted(arr, 0));
       
    }

    public static void sum(int[] arr) {
        // getting sum of array value
        int sum = 0; // intialized of sum is equal to zero
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("The sum of value: " + sum);

        int[] ar = { 1, 2, 3, 4, 5 };
        int[] rev = new int[ar.length];

        for (int i = 0; i < ar.length; i++) {
            rev[i] = ar[ar.length - 1 - i];
        }

        System.out.println(rev);
    }

    public static void StringProblem(){
        String str = "I am Pavan";
        String rev = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch ==' '){
                rev = rev + "_";
            }else {
                rev = rev + ch;
            }
        }
        System.out.println("Underscore String: " + rev);
    }


    public static void twoPointer(){
        int[] arr = {1,2,3,4,5,6};
        int l = 0, r = arr.length - 1;
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static  void twoPointerSum(){
        int[] arr = {1,2,3,4,6};
        int target = 6;
        int l = 0, r =  arr.length - 1;

        while(l < r){
            int sum = arr[l] + arr[r];

            if(sum == target){
                System.out.println("Pair found: " + arr[l] + "," + arr[r]);
                return;
            } else if(sum < target){
                l++;
            }else{
                r++;
            }   
        }
        System.out.println("No pair found");
    }
    public static void twopointerwithsum(){
        int[] arr = {1,2,3,4,5,6};
        int target = 6;
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                System.out.println("Pair found: " + arr[left] + "," + arr[right]);
            }else if(sum < target){
                left++;
            }else {
                right++;
            }
        }
        System.out.println("No pair found");
    }

    public static void string(){
        String s = "I am Pavan";
        String rev = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                rev = rev + '-';
            }else{
                rev = rev + ch;
            }

        }
        System.out.println(rev);
    }
    public static void sum(){
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    public static void sclidWindow(){
        int[] arr = {-1, 2, 3, 3, 4, 5, -1 };
        int n = arr.length;
        int k = 4; 
        int l  = 0;
        int r =  k -1;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum+= arr[i];
        }
        int maxSum = sum;
        while(r < n -1){
            sum -= arr[l];
            l++;
            r++;
            sum += arr[r];
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println("The max sum of size " + k + " is: " + maxSum);
    }
    public static void windowSumlesserNumber(){
        int[] arr = {2,5,1,7,10};
        int k = 14;
        int maxSum = 0;
        for(int i = 0; i < arr.length - 1; i++){
            int sum = 0;
            for(int j = 0; j < arr.length- 1; j++){
                sum = sum + arr[j];
                if(sum <= k){
                    maxSum = Math.max(maxSum , j -i+1);
                }else if(sum > k) break;
               
            }
        }
        System.out.println(maxSum);
    }
   
}
