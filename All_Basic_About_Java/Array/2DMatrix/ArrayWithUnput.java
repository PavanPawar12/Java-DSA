import java.util.*;
public class ArrayWithUnput {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter the number of element you want sum: ");
        // int n = in.nextInt();
        // int[] arr = new int[n];

        // for(int i = 0; i < n; i++){
        //     arr[i] = in.nextInt(); // read element
        // }
        // int sum = 0; 
        // for(int i = 0; i < n; i++){
        //     sum += arr[i];
        // }
        // System.out.println("Sum of this array : j" + sum);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        for(int i = count; i < n; i++){
            arr[i] = 0;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void endZero(int[] arr){
        int n = arr.length;
        int j = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        while(j < n){
            arr[j] = 0;
            j++;
        }
        for(int k = 0; k < j; k++){
            System.out.print(arr[k] + " ");
        }
    }
}