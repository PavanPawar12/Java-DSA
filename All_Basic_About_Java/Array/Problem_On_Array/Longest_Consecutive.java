public class Longest_Consecutive {
    public static void main(String[] args){
        // int[] arr = {100, 4, 200, 1, 3, 2}; 
        // Longest_Consecutive obj = new Longest_Consecutive();
        // int ans = obj.longestConsecutive(arr);
        // System.out.println("The longest consecutive sequence is: " + ans);

        

    }   
    private boolean linearSearch(int[] a, int num){
        int n = a.length;
        for(int i = 0; i < n; i++){
            if(a[i] == num){
                return true;
            }
        }
        return false;
    }

    public int longestConsecutive(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int n = arr.length;
        int longest = 1;
       

        for(int i =0; i < n; i++){
            int x = arr[i];
            int count = 1;
            while(linearSearch(arr, x + 1) == true){
                x += 1;

                count += 1;
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }
}
