import java.util.*;
public class LearnArrayClass{
    public static void main(String[] args) {
        // int[] numbers = {1,2,3,5,6,7,8};
        // int result = Arrays.binarySearch(numbers, 5);
        // System.out.println(result);


        Integer[] numbers = {10,3,2,4,6,5,8,9};
        Arrays.sort(numbers);

        // Arrays.fill(numbers, 22);  // it filler over all the element in array 
        for(int i : numbers){
            System.out.print(i + " ");
        }

    }
}