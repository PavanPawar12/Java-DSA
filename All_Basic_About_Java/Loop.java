

public class Loop {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){

                // System.out.print(i + " ");
            }
        }
        // calculate the sum 
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        // System.out.println("Sum of all number: " + sum);

        // multiplication table
        int no = 5;
        for(int i = 1; i <= 10; i++){
            int result = i * no;
            System.out.println(no + " X " + i +" = " + result);
        }

        // Print the sum of all even number
        int num = 5; 
        int s = 0;
        for(int i = 1; i <= num; i++){
            if(num % i != 0){
                s += i;
            }
            
        }
        System.out.println("Sum of even number: " + s);

        // print all the element divisible by 5 between 1 to 2000
        for(int i = 1; i <= 100; i++){
            if(i % 5 == 0){
                System.out.println(i + " ");
            }
        }

        // calculate min and max value from array
        int[] arr = {10, 25, 35, 15};
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i]; // change if max value found
            }
        }
        System.out.println("Maximum value: " + max);

        // count the number of digit in a given number
        int number = 190234;
        int count = 0;
        // while(number > 0){
        //     number = number / 10; 
        //     count++;

        // }
        for(int i = number; i > 0; i = i / 10){
            count++;
        }
        System.out.println(count);

        // sum of array element 
        int[] arra = {1,2,3,4,5};
        int su = 0; 
        for(int i = 0;i < arra.length; i++){
            su += arra[i];
        }
        System.out.println("The sum of array: " + su);

        int i = 1;
       do {
            System.err.println(i);
            i++;
       } while (i > 9);
    }



    
}