
import java.lang.classfile.ClassSignature;
import javax.tools.FileObject;


// import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        // int nusms = 10;
        // String name = "Kunal Kushwaha";
        // System.out.println(name);


        // String s = "Pavan";
        // System.out.println(s);  // jav does not change "Pavan"
        // s = "Jivan";    
        // System.out.println(s);  // a new string object "jivan" created

        // String str = "pavan pawar";
        // System.out.println(Arrays.toString(str.toCharArray()));
        // System.out.println(str.indexOf('w'));


        String a = "pavan";
        String b = "pavan";
        String c = a;
        System.out.println(a == c);

        String name1 = new String("jivan");
        String name2 = new String("jivan");
        System.out.println(name1.equals(name2));

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)(  'a' +i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.reverse();
        System.out.println(builder);

        String str = "er";
        System.out.println(isPalindrom(str)); 
        System.out.println(fibo(7));
    }

    static boolean isPalindrom(String str){
        if(str == null || str.length() - 1 == 0){
            return false;
        }        
        
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(start != end){
                return false;
            }
        }
        return true;

    }  

    static int fibo(int n){
        if( n < 2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
