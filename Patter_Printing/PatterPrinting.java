public class PatterPrinting {
    public static void main(String[] args) {
        // int n = 4;
        // triangle();
        // string();
        // patter2(5);
        patter3(5);
        // pattern4(4);
        pattern5(4);
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
    
    static void patter1(int n){
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    } 

    static void patter2(int n){
        for(int row = 0; row <2*  n; row++){
            int totalColinrow = row > n ?  2*n - row :row;
            for (int col = 0; col < totalColinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
    static void patter3(int n){
        for(int row = 0; row < 2*n; row++){
            int totalColinrow = row > n ?  2*n - row :row;
            int noOfSpace = n - totalColinrow;
            for (int s = 0; s < noOfSpace; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row = 1; row <= n; row++){
            
            for(int s = 1; s < n - row; s++){
                System.out.print(" ");
            }

            for (int col = n; col >= 1; col--) {
                System.out.print(col);
            }
            
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i = 0; i < n; i++){
            for(int s = 1; s < n - i; s++){
                System.out.print(" ");
            }
            for(int j = 0; j < n - i; j++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }
    
}