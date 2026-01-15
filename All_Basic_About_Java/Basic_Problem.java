public class Basic_Problem {
    public static void main(String[] args){
        Basic_Problem obj = new Basic_Problem();
        int result = obj.factorial(10);
        System.out.println(result);
        // factorial(4);
        int n = 29;
        if(isPrime(n)){
            System.out.println(n + " is prime");
        } else{
            System.out.println(n + " is not prime");
        }
    }
    
    public int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n *  factorial(n -1);
        
    }
    // prime number
    static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= n; i ++){  // check all element from 2 to 2 -1
            if(n % i == 0){
                return false; // divisible not prime
            }
        }
        return true;
    }

    
    
}
