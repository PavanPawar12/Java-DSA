public class JustPratice {
    public static void main(String[] args){
        // StringBuilder builder = new StringBuilder();
        // builder.append("Hello");
        // builder.insert(0, "Pawav ");
        // builder.delete(1, 2);
        // builder.reverse();
        // builder.toString();
        // System.out.println(builder);

        String s = "pavan";
        for(int i = 0; i < s.length(); i++){
            // System.out.print(s.charAt(i));
        }
       
        String str = "Pavan";
        int vowel= 0;
        int con=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowel++;
            } else{
                con++;
            }
        }
        // System.out.println("Vowel :" + vowel);
        // System.out.println("Consonent : " + con);

        String b1 = "banana";
        String re = "";
        for (int i = 0; i < b1.length(); i++) {
            if(b1.charAt(i) != 'a'){
                re = re + b1.charAt(i);
            }
        }
        // System.out.println(re);


        String r = "abc";
        String rev = "";
        for(int i = r.length() - 1; i >= 0; i--){
            rev = rev + r.charAt(i);
        }



        String stri = "I am Pavan";
        String result = "";
        for (int i = 0; i <stri.length(); i++) {
            char ch = stri.charAt(i);
            if(ch == ' '){
                result = result + "_";
            } else {
                result = result + ch;
            }
        }
        // System.out.println("Added Underscore: "+ result);

        String s1 = "a1b2c3";
        String  result1 =" ";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if(ch < '0' || ch > '9'){
                result1 = result1 + ch;
            }
        }
        // System.out.print("Result: " +result1 );

        // palindrom
        String s2 = "mdam";
        String  rev1 ="";
        for (int i = s2.length() - 1; i >= 0; i--) {
            rev1 = rev1 + s2.charAt(i);
        }
        if(s2.equals(rev1)){
            System.out.println("Palindrom");
        } else{
            System.out.println("Not palindrom");
        }

        // System.out.println("Reverse String : " + rev );
        // aboutString();
        // 
        // freqCaracter();
        // freqCharacter();

        String s3 = "pavan"; // test string

        if(isPalindrom(s3)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    public static void aboutString(){
        String str = "This is pavan pawar";

        // str = str.trim();
        // String[] words = str.split("\\s+");
        // System.out.println("Numbers of words: " + words.length);
        int count= 0;
        boolean inWord = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                if(!inWord){
                    count++;
                    inWord= true;
                }
            } else{
                inWord = false;
            }
        }
        // System.out.println("Count: " + count);
    }

     public static void freqCaracter() {
        String str = "hello world";

        int[] freq = new int[256]; // ASCII size

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;   // increment frequency
        }

        // print characters and their frequency
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " : " + freq[i]);
            }
        }
    }


    public static void freqCharacter(){
        String str = "Hello pavan how are you";
        int [] freq = new int[256];

        for (int i = 0; i < 256; i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        for (int i = 0; i < 256; i++) {
            if(freq[i] > 0){
                System.out.println((char)i + " : " + freq[i]);
            }
        }
    }

    public static boolean isPalindrom(String s){
        int left = 0;
        int right = s.length() - 1;
        while (left < right) { 
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
    
    
}
