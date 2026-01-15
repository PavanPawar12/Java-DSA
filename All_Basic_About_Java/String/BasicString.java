import java.util.*;
;

public class BasicString {
    public static void main(String[] args){

        // primitive are stored in stack memory and object are store in heap memory;
        String a = "Pavan";
        String b = "jivan";

        String c = a;
        System.out.println(c == a);
        String name1 = new String("Pavan");
        String name2 = new String("Pavan");    
        System.out.println(name1 == name2); // this is comparision --> false

        // .equal()
        System.out.println(name1.equals(name2)); // using method --> true

        System.out.println(name1.charAt(2));


        // stringAdding();
        String st = "madam";
        if(isPalindrom(st)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
        int num = 1211;
        System.out.println(isNumPalindrom(num));

        String s = "I am Pavan";
        String result = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch==' '){
                result = result + "++";
            } else{
                result = result + ch;
            }
        }
        System.out.print("Result:" + result);

        System.out.println();
        System.out.println(isAnagram("level", "vlel"));
    }

    public static boolean isPalindrom(String st){
        int left = 0;
        int right = st.length() - 1;
        while(left < right){
            if(st.charAt(left) !=st.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static boolean isNumPalindrom(int num){
       
        int original = num;
        int reverse = 0;
        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10  + digit;
            num = num / 10;
        }
        return original == reverse;
    }

    public static void longestSubString(){
        // need to write a code 
    }

    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b); 
        // if not 
    }

    
    
}
