package third_loops_Arrays;

public class $3arrayBasicCode {
    public static void main(String[] args) {
        int[]arr = new int[10];
         arr[0] = 1 ; arr[1] =13; arr[2] =17; arr[3] =23; arr[4] =33; arr[5] =43; arr[6] =53; arr[7] =63;

        // -----------------------------------------------------------  

         int n =  8;
         int removeIndex=3;

         for(int x : arr){
            System.out.print(x + ",");
         }
         
         System.out.println();                       //deleting a element

         for(int i = 0;i<arr.length;i++){
            if( i == removeIndex){
                for(int m = i ; m<n;m++){
                     arr[m] = arr[m+1];
                }
            }
         }
           for(int x : arr){
            System.out.print(x + ",");
         }


        // -----------------------------------------------------------  
        
        
        // int n =  8;
        // int index = 2;
        // int putvalueIndex = 1000;

        //  for( int x : arr){
        //     System.out.print(x + ",");
        //  } 
        //  System.out.println();

        //  for(int i =0;i<arr.length;i++){       //insertion of an element
        //     if(i == index){
        //         for(int a = n;a>index;a--){
        //             arr[n] = arr[n-1];
        //         }
        //         arr[i] = putvalueIndex;
        //     }
        //  }

        //  for( int x : arr){
        //     System.out.print(x + ",");
        //  } 


        // -----------------------------------------------------------
        // int temp = arr[0];
        // for(int i =0;i<arr.length -1;i++){
        //     arr[i] = arr[i+1];
        // }                                 //rotating array
        // arr[arr.length-1] = temp;
        // for(int x : arr){
        //     System.out.println(x);
        // }
    }
}
