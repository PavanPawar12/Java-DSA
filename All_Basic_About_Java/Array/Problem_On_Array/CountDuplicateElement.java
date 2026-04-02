
import java.util.HashSet;

public class CountDuplicateElement{
    public static void main(String[] args) {
    //    System.out.println(fibo(5));
    count();    
    }

    public static void count(){
        int[] arr = {1,2,3,2,4,5,2,2,2,2};
        
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
           if(!set.contains(num)){
                System.out.println(num);
           }
           set.add(num);
        
        }
        
    }

}