public class SetMatrixZero{
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        SetMatrixZero obj = new SetMatrixZero();
        obj.setMatrixZero(arr);
        for(int[] row: arr){
            for(int val: row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public void setMatrixZero(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;

        // for(int i = 0; i < m; i++){
        //     for(int j = 0; j < n; j++){
        //         if(arr[i][j] == 0){

        //             for(int col = 0; col < n; col++){
        //                 if(arr[i][col] != 0){
        //                     arr[i][col] = 0;
        //                 }
        //             }

        //             for(int row = 0; row < m; row++){
        //                 if(arr[row][j] != 0){
        //                     arr[row][j] = 0;
        //                 }   
        //             }
        //         }
        //     }
        // }

        // for(int i = 0; i < m; i++){
        //     for(int j = 0; j < n; j++){
        //         if(arr[i][j] == -1){
        //             arr[i][j] = 0;
        //         }
        //     }
        // }


        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        // we need to search where 0 is occuring and update
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        // update matrix
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++){
                if(row[i] || col[j]){
                    arr[i][j] = 0;
                }
            }
        }
    }
}