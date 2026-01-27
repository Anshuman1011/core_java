package second_string;

import java.util.Scanner;

public class $13forLoop
 {
   public static void main(String[] args) 
   {
    Scanner sc = new Scanner(System.in);
    // int table = sc.nextInt();
    // for(int i =0 ;i<=10;i++)              //MULTIPLICATION DISPLAYED OF ANY NO
    // {     
    //     System.out.println(table + "x" + i + " = " + table * i);
    // }

    // int num = sc.nextInt();
    // int sum = 0;
    // for(int i =0;i<=num;i++){             //SUM OF N NATURAL NO
    //     sum = sum + i;
    //     System.out.println("sum is " + sum);
    // }
    // System.out.println("the sum of n natural no is : " + sum);

    int fac = sc.nextInt();
    int ans =1;
    for(int i = fac;i>=1;i--){
         ans = ans * i;
         System.out.println("fac of a number is " + ans);
    }
    System.out.println("the toal fac of a number is " + ans);
   } 
}
