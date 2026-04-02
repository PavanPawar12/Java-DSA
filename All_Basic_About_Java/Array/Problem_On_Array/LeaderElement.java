
import java.util.ArrayList;

public class LeaderElement {
    public static void main(String[] args){
        // int[] arr = {4,7,1,0};
        int[] arr = {10, 22, 12, 3, 0, 6};
        LeaderElement obj = new LeaderElement();
        // Get leaders using class method
        ArrayList<Integer> ans = obj.leaderELement(arr);
        System.out.println("Leader in array are: ");
        for(int num : ans){
            System.out.print(num + " ");
        }
        System.out.println();

    }

    public ArrayList<Integer> leaderELement(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            boolean leader = true;
            for(int j = i + 1; j < n; j++){
                 /* If any element to the right is greater 
                or equal, nums[i] is not a leader */
                if(arr[j] >= arr[i]){
                    leader = false;
                    break;
                }
            }
            // If nums[i] is a leader, add it to the ans list
            if(leader){
                list.add(arr[i]);
            }
        }
        return list;
       
        
    }
}
