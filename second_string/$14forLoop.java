package second_string;

import java.util.Scanner;

public class $14forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// --------------------------------------------------------------------------        
     
 int num = sc.nextInt();          //armstrong number
 int storenum = num;
 int store;
 int answer = 0;
 while(num != 0){
     store = num % 10;
     answer = answer + store * store * store;
     num = num/10;
 }

   if (answer == storenum){
    System.out.println("it is a armstrong no");
   }
   else{
    System.out.println("it is not a armstrong no");
   }

// --------------------------------------------------------------------------        
     



// --------------------------------------------------------------------------        
        //  int num = sc.nextInt();     
        //  int count = 0;                               //count digits of a number
        // while(num !=0){
        //     num=num/10;
        //     count++;
        // }
        // System.out.println(count);

// --------------------------------------------------------------------------





// --------------------------------------------------------------------------
        // int num = sc.nextInt();                   //print digits of a number
        // while(num !=0){
        //     System.out.println("the digits of the number are " + num%10);
        //     num=num/10;
        // }

// --------------------------------------------------------------------------

      
    }
}
