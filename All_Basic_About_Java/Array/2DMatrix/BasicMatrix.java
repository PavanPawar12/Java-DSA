import java.util.Scanner;

public class BasicMatrix {
    public static void main(String[] args){
        // int[][] arr = {{1,2,3,}, {4,5,6},{7,8,9}};
        // TwoDArrayWithInput();
        // sumofEachRow();
        sumofEachCol();
    } 
    
    public static void TwoDArrayWithInput(){
         // System.out.println(arr.toString());
        Scanner in = new Scanner(System.in);
        int row = 3;
        int col = 3;
        int[][] matrix = new int[row][col];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                System.out.print("Enter " + i +" and " + j + " : ");
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("The matrix is: ");
         for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
               System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }   
    }
    public static void sumofEachRow(){
        int[][] matrix ={  {1,2,3}, 
                            {4,5,6}, 
                            {7,8,9}
                        };
        for(int i = 0; i < matrix.length; i++){
            int sum = 0;
            for(int j = 0; j < matrix.length; j++){
               sum += matrix[i][j];
            }
            
            System.out.println("Row " + i + " Sum = "+ sum);
        }
    }
    public static void sumofEachCol(){
        int[][] matrix ={  {1,2,3}, 
                            {4,5,6}, 
                            {7,8,9}
                        };
        int max = 0;

        for(int col = 0; col < matrix.length; col++){
            int sum = 0;
            for(int row = 0; row < matrix.length; row++){
                sum += matrix[row][col];
                max = Math.max(max, sum);

            }
            
            System.out.println("Row " + col + " Sum = "+ sum);
        }
        System.out.println("Max from Col: " + max);
    }

}
