import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Pavan Pawar";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()); 
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('a') );

        System.out.println("    pavan".strip());
        System.out.println(Arrays.toString(name.split(" ")));

        String str1 = "abcba";
        System.out.println(isPalindrom(str1));

        String str2 ="avba";
        System.out.println(palindrom(str2));

    }

    public static boolean isPalindrom(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            
            if(start != end){
                return false;
            }
        }
        return true;
        
    }

    public static boolean palindrom(String str){
       
       str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

       int left = 0, right = str.length() - 1;
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
