
import java.util.Scanner;


public class Basic_Array {

    public static void main(String[] args) {
        int[] arr = {10, 3, 4, 5, 6, 7, 8};
        int n = arr.length - 1;
        int sum = arr[n];
        for (int i = n - 1; i >= 0; i--) {

            sum += arr[i];
        }
        int average = sum / arr.length;
        // System.out.println("The of Array: " + sum);
        // System.out.println("Average of all number: " + average);

        int[] array = {7, 8, 9, 10, 11};
        // countEvernORodd(array);


        
        // SearchElement(arr, 3);
        // SearchElement(arr, 100);

        sumofnumber();

    }

    public static void countEvernORodd(int[] array) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even No: " + even);
        System.out.println("Odd No: " + odd);
    }

    public static void SearchElement(int[] arr, int key){
        boolean found  = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                found  = true;
                System.out.println(key + " found at index " + i);
            }
        }
        if(!found ){
            System.out.println(key +  " is not Found ");
        }
    }

    public static void sumofnumber(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();  
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();  
        int sum = num1 + num2;
        System.out.println("Sum of two number is: " + sum);

    }
}
