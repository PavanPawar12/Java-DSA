public class Practice {

    static void oneTOn(int n){
        if(n == 0){
            return;
        }
        System.out.println(n); 
        oneTOn(n - 1);
        System.out.println(n);
    }
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    static int fact(int n){
        if(n == 0){
            return 1;

        }
        return n * fact(n - 1);
    }


    static int binarySearch(int[] arr, int target, int s, int e){
        if(s > e){
             return -1;
        }
        int m = s + (e - s)/2;
        if(arr[m] == target){
            return m;
        }
        else if(target < arr[m]){
            return binarySearch(arr, target, s, m-1);
        }else{
            return binarySearch(arr, target, m + 1, e); 
        }
        
    }
    public static void main(String[] args){
        // int result = fibo(7);
        // System.out.println(result);
        // System.out.println(fact(5));

        // int[] arr = {1,2,3,4,5,6,9};
        // int target = 1;
        // System.out.println(binarySearch(arr, target, 0, arr.length - 1));
        oneTOn(5);
    }
}
