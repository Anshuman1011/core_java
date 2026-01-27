package second_string;

import java.util.Scanner;

public class $11switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
          

        sc.nextLine();


        System.out.println("enter the operation which you wanna perform");
        String operation = sc.nextLine();


       switch (operation) {
        case "ADD":
            System.out.println(a+b);
            break;                 //USING SWITCH CASE

        case "SUB":
            System.out.println(a-b);
            break;

        case "MUL":
            System.out.println(a*b);
            break;

        case "DIV":
            System.out.println(a/b);
            break;
       
        default:
            System.out.println("INVALID");
            break;
       }





        // ------------------------
        //USING SIMPLE IF ELSE CONDITION

        // sc.nextLine();
        
        // System.out.println("what operation you wanna perform ");
        // String operation = sc.nextLine();

        // if(operation.equals( "add"))
        // {
        //     System.out.println(a+b);
        // }
        // else if(operation.equals( "subtract"))
        // {
        //     System.out.println(a-b);
        // }
        // else if(operation .equals("multiply"))
        // {
        //     System.out.println(a*b);
        // }
        // else
        // {
        //     System.out.println(a/b);
        // }
        
    }
}
