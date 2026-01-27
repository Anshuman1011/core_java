package second_string;

import java.util.Scanner;

public class $6conditional_ifElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the number");
        // int n = sc.nextInt();
        // if(n % 2 == 0)
        // {
        //     System.out.println("no is even");    //no is odd or not
        // }
        // else
        // {
        //     System.out.println("no is odd");
        // }
// -----------------------------------------------------------------------------------------------
        // System.out.println("enter the age of person ");
        // int age = sc.nextInt();
        // if(age >=14 && age<=55)
        // {                                    //age young or not using if-else
        //     System.out.println("young");
        // } 
        // else
        // {
        //     System.out.println("not young");
        // }

// ---------------------------------------------------------------------------------------------------

        System.out.println("enter the marks for m1 , m2 , m3");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        int avg = total /3;
        
        if(avg>=70)
        {
            System.out.println('A');
        }
        else if(avg>=60 && avg <70)
        {
            System.out.println('B');
        }
         else if(avg>=50 && avg <60)
        {
            System.out.println('C');
        }
         else if(avg>=40 && avg <50)
        {
            System.out.println('D');
        }
        else
        {
            System.out.println('F');
        }

    }
}
