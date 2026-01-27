package third_loops_Arrays;

public class $5twoDimensionalArray {
    public static void main(String[] args) {
        // int [] [] B = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };                                //SIMPLE 2D ARRAY PRINTING
        // for(int i =0;i<B.length;i++){
        //     for(int j = 0;j<B[i].length;j++){
        //         System.out.print(B[i][j] + " ");
        //     }
        //     System.out.println();
        // }

    //  ----------------------------------------------------------------------------------
        int[][] A;
        A= new int[3][];
        A[0]= new int[2];
         A[1]= new int[7];                  //jacked array -- columns length vary in it
          A[2]= new int[9];

          for(int x[] : A){
            for(int y : x){
                System.out.print(y +" ");
            }
            System.out.println();
          }
    }
}
