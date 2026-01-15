public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,5};
        int longest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(longest <  arr[i]){
                longest = arr[i];
            }
        }
        System.out.println("Longest: " + longest);
    }
}
