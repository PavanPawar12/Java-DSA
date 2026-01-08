public class findElement {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9}; // if 18 --> true , if 8 --> false
        System.out.println(find(arr, 8, 0));
    }
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    }
}
