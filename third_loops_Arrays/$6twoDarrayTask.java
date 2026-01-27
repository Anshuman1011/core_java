package third_loops_Arrays;

public class $6twoDarrayTask {
    public static void main(String[] args) {
       int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
       int[][] B = {{1,2,3},{4,5,6},{7,8,9}};
       int[][] C = new int[3][3];

       for(int i =0;i<C.length;i++){
        for(int j =0;j<C[i].length;j++){
           C[i][j]=0;
         for(int k =0;k<A.length;k++){
            C[i][j] = C[i][k] + A[i][k] * B[k][j];
         }
        }
       }

        for(int i =0;i<C.length;i++){
        for(int j =0;j<C[i].length;j++){
        System.out.print( C[i][j] + " ");
        }
        System.out.println();
       }

    }
}
