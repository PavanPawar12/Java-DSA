public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7, 12};
        int largest = arr[0];
        
        // for (int i = 0; i < arr.length; i++) { // this is not optimum solution
        //     if(largest < arr[i]){
        //         largest = arr[i];
        //     }
        // }
        // int secondLarget = -1;
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i] > secondLarget && arr[i] != largest){
        //         secondLarget = arr[i];
        //     }
        // }

        int secondLarget = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(largest < arr[i]){
                secondLarget = largest;
                largest = arr[i];
            }
            if(arr[i] > secondLarget && arr[i]!= largest){
                secondLarget = arr[i];
            }
            
        }
        System.out.println("Second Largest Element: " + secondLarget);
    }

}
