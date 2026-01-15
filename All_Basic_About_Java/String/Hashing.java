import java.util.*;
public class Hashing  {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // this will take entire array element
        for(int val: arr){
            System.out.print(val + " ");
        }
        System.out.println();

        // Hashing
        HashMap <String, Integer> map = new HashMap<>();
        map.put("india", 123);
        map.put("china", 124);
        map.put("USA", 125);

        System.out.println(map);

        if(map.containsKey("america")){
            System.out.println("present");
        } else{
            System.out.println("Not present");
        }

        String str ="PAvan";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("The ASCII value of " + ch + " is : " + (int)ch);
        }
        
        // print all the substring of string 
        

        // char ch = 'a';
        // int ascii = (int) ch;

        // System.out.println("The ASCII value of " + ch + "is : " + ascii);

        String st ="Pavan is googd boy";
        String result = "";
        for(int i = 0; i < st.length(); i++){
            char ch = st.charAt(i);
            if(ch == ' '){
                result = result + "_";
            } else{
                result = result + ch;
            }
        }
        System.out.println("Result: " + result);

        System.out.println(isPalindrom());
    }

    public static boolean  isPalindrom(){
        String str = "level";
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}