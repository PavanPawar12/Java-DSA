public class findElement {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9}; // if 18 --> true , if 8 --> false
        System.out.println(find(arr, 8, 0));

        // return index 
        System.out.println(findIndex(arr, 18, 0));

        
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
    
}
