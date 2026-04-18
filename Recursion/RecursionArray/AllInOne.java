import java.util.*;
public class AllInOne {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        list.add()
        int n = 10;
        // System.out.println(fibo(5));
        for(int i = 0; i < n; i++){
            System.out.print(fibo(i) + " ");
        }

    }
    public static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
        
    }
}
