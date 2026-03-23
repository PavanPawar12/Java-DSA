
import java.util.ArrayList;



public class Practice{
    public static void main(String[] args){
        // print1(1);
        // System.out.println(fibo(7));
        // int[] arr = {1,2,3,4,5,6,90};
        // int result = search(arr, 4, 0, arr.length - 1);
        // System.out.println(result);
        // System.out.println(factorial(5));
        // String s = "Hello";
        // System.out.println(reverseString(s));
        // int sum = totalSum(10);
        // System.out.println(sum);
        // // int count = countZeros(10002340);
        // System.out.println(countZeros(100100));

        // int[] arr = {11,2,3,4,56,78,23,54};
        // int result = binarySearch(arr, 23, 0,arr.length - 1);
        // System.out.println(result);
        // int[] arr = {1,2,93,4};
        // System.out.println(sorted(arr, 0));
        
        // int[] arr = {1,2,43,54,59,6};
        // System.out.println(search(arr, 43, 0));
        // System.out.println(searchindex(arr, 54, 0));
        
        // int[] arr1 = {11,21,21,31,21,41,51,61,71,81,91};
     
        // System.out.println(findAllIndex(arr1, 21, 0, new ArrayList<>()));
        // int[] arr = {1,2,3,2,4,2};

        // System.out.println(findAllIndex1(arr,2,0));
        
        int[] arr = {5,6,7,8,9,1,2,3,4,5};
        System.out.println(binarysearchUsingRecurion(arr, 4, 0, arr.length - 1));
    }
    static void print1(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print1(n + 1);
        System.out.println(n);
    }

    static int fibo(int n){
        if(n == 0 ||  n== 1){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    static int search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + ( e- s) / 2;
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m + 1, e);
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return  n * factorial(n - 1);
    }
    public static String reverseString(String s){
       if(s.length() == 0){
        return s;
       }
       return reverseString(s.substring(1)) + s.charAt(0);

    }

    public static int totalSum(int n){
        if(n == 0){
            return n;
        }
        return n + totalSum(n -1);
    }
    public static int countZeros(int n){
        if(n == 0){
            return 0;
        }
        int digit = n % 10;
        if(digit == 0){
            return 1 + countZeros(n /10);
        }
        return countZeros(n / 10);
    }


    public static int binarySearch(int[] arr, int target, int start , int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start) /2;

        if(arr[mid] == target){
            return mid;
        }

        if(target < arr[mid]){
            return binarySearch(arr, target, start, mid - 1);
        }

        return binarySearch(arr, target, mid + 1, end);
    }
    static boolean sorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

    
    public static boolean search(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr, target, index + 1);
    }
    
    public static int searchindex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return searchindex(arr, target, index + 1);
    }

    static ArrayList findAllIndex(int[] arr, int target, int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1,list);
    }

    static ArrayList<Integer> findAllIndex1(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCall = findAllIndex1(arr, target, index + 1);
        list.addAll(ansFromBelowCall);
        return list;
    }

    public static int binarysearchUsingRecurion(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int mid  = s + (e - s)/2;

        if(target == arr[mid]){
            return mid;
        }
        if(arr[s] <= arr[mid]){
            if(target >= arr[s] && target <= arr[mid]){
                return binarysearchUsingRecurion(arr, target, s, mid - 1);
            }else{
                return binarysearchUsingRecurion(arr, target, mid + 1, e);

            }
        }

        if(target >= arr[mid] && target >= arr[e]){
            return binarysearchUsingRecurion(arr, target, mid + 1, e);
        }
        return binarysearchUsingRecurion(arr, target, mid - 1, e);
    }


}