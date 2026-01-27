package third_loops_Arrays;

public class $4arrayBasicCode {
    public static void main(String[] args) {
        int[]arr = {11,22,33,44,55,66,77,88,99};


    // -------------------------------------------------------------------------------------

        // int[]copy = new int[arr.length];
        // for(int i =0;i<arr.length;i++){        //COPYING AN ARRAY
        //     copy[i] = arr[i];
        // }
        // for(int x : copy){
        //     System.out.print(x + ",");
        // }

    // -------------------------------------------------------------------------------------

       int[]copy = new int[arr.length];
       int count = 0;
       for(int i = arr.length-1;i>=0;i--){
        copy[count]=arr[i];
        count++;
       }
        for(int x : copy){
            System.out.print(x + ",");
        }
        arr = copy;
        copy = null;

    }
}
