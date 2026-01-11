
import java.util.ArrayList;

public class findElement {
    public static void main(String[] args) {
        int[] arr = {3,2,1,1,18,9}; // if 18 --> true , if 8 --> false
        // System.out.println(find(arr, 8, 0));

        // return index 
        // System.out.println(findIndex(arr, 18, 0));

        // System.out.println(findIndexLast(arr, 9, arr.length-1 ));   // starting from last --> ans--> 5

    //   findIndexAll(arr, 1, 0);
    //   System.out.println(list); // [2,3]
    
        // System.out.println(findAllIndex(arr, 1, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, 1, 0));
    }
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    }
    
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }else{

            return findIndex(arr, target, index+1);
        }
        
    }
    
    static int findIndexLast(int[] arr, int target, int index){  // not working
        if(index == -1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }else{
            return findIndexLast(arr, target, index-1);
        }
        
    }


    static ArrayList<Integer> list = new ArrayList<>();
    static void findIndexAll(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }
        findIndexAll(arr, target, index+1);
        
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);  
    }
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        
        // this will contain answer for allfunction call only 
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer>  ansFromBelowCall = findAllIndex(arr, target, index+1, list);  
        list.addAll(ansFromBelowCall);
        return list;
               
    }

    

    
}
