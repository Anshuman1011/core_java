package second_string;

import java.util.Scanner;

public class $7conditional_ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year ");
        int year = sc.nextInt();
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 !=0) )
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }
    }
}
//if a year is prime or not
