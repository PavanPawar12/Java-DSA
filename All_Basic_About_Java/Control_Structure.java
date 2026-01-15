
import java.util.Arrays;
import java.util.Scanner;

public class Control_Structure {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 30;
        if(age < 43) System.out.println("age is small"); else System.out.println("Big number ");
        System.out.print("Enter the marks: ");
        int marks = in.nextInt();
        if(marks >= 90 ){
            System.out.println("outStanding");
        } else if(marks >= 75){
            System.out.println("Medium");
       
        } else if(marks >= 40){
            System.out.println("Very low");
        } else{
            System.out.println("You are fail !!!");
        }
        // switch statement in java programming language with basic example
        
        int[] arr  = {1, 2, 3,4};
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // toString() is method from the class object , it represent string representation of an object 

        for(int i = arr.length -1; i >= 0; i--){
            System.out.print(i + " ");
        }
    }

    
    
    

    
}
