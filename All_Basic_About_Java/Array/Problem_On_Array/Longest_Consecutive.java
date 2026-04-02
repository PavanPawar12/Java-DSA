public class Longest_Consecutive {
    public static void main(String[] args){
        // This is confusing question while dry run of this kind of question 
        int[] arr = {100,103,104,105,107,106,107, 4, 200, 1, 3, 2,3,3}; 
        Longest_Consecutive obj = new Longest_Consecutive();
        int ans = obj.longestConsecutive(arr);
        System.out.println("The longest consecutive sequence is: " + ans);

    }   
    public boolean linearSearch(int[] arr, int num){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

    public int longestConsecutive(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int n = arr.length;
        int largest = 1;
        
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int count = 1;
            while(linearSearch(arr, x + 1) == true){
                x = x + 1;
                count = count + 1;
            }
            largest = Math.max(largest, count);
            
        }
       return largest;

    }
}
