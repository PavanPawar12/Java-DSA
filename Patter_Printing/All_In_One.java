public class All_In_One {
    public static void main(String[] args){
        pattern9(5);
    }

    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n  ; j++) {     
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 0; i < n; i++) {
            for(int s = 0; s < n - i; s++){
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i  ; j++) {     
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 0; row < 2*n ; row++) {
            int totalcolInRow = row > n ? 2 * n - row: row;
            for(int col = 0;  col < totalcolInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){ // same as it is pattern5
        // increasing order 
        for (int i = 0; i < n; i++) {                     
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // decreasing order
        for(int i=n - 1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int row = 0; row < 2*n ; row++) {
            int totalcolInRow = row > n ? 2 * n - row: row;
            
            int noOfSpace = n - totalcolInRow;
            for (int i = 0; i < noOfSpace; i++) {
                System.out.print(" ");
            }
            for(int col = 0;  col < totalcolInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern8(int n){
        for(int row = 1; row<= n; row++){
            for(int s = 0; s < n-row; s++){
                System.out.print(" ");
            }
            for(int col = row;  col>= 1; col--){
                System.out.print(col); 
            }
            for(int col= 2; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for(int row = 1; row<= 2* n; row++){
            int c = row > n ? 2*n - row: row;
            for(int s = 0; s < n-c; s++){
                System.out.print("  ");
            }
            for(int col = c;  col>= 1; col--){
                System.out.print(col + " "); 
            }
            for(int col= 2; col <= c; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
