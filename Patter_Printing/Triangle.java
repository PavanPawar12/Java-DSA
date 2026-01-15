public class Triangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                // System.out.print(j);
            }
            // System.out.println();
        }
        triangle();
        string();
    }

    static void triangle() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    static void string(){
        String s = "abcada";
        String ad = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != 'a'){
                ad = ad + ch;
            }
        }
        System.out.println(s);
        System.out.println(ad);
    }

}