package third_loops_Arrays;

public class $2arrayBasic {
    public static void main(String[] args) {
        int arr[] = {3,9,7,8,12,6,15,5,4,14};

         int largest = Integer.MIN_VALUE;
         int seclargest = 0;
         for(int i =0;i<arr.length;i++)
        {
             if(arr[i] > largest){
                 seclargest = largest;
                largest = arr[i];
             }
             else if (arr[i] > seclargest){
                seclargest = arr[i];
             }
         }

         System.out.println(seclargest);







        // -------------------------------------------

        // int find = 10;  
        // for(int i =0;i<arr.length;i++){
        //     if(find == arr[i])                    //find an element
        //     {
        //         System.out.println(i);
        //     }           
        // }
         
        // -------------------------------------------
        // int answer = 0;
        // for(int i : arr)
        // {
        //     answer+=i;              //sum of a array
        // }
        // System.out.println(answer);
         // -------------------------------------------
    }
}
