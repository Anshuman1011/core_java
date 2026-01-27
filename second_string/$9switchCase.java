package second_string;

import java.util.Scanner;

public class $9switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();

       String type = s.substring(s.lastIndexOf(".") +1 , s.length());

        switch(type)
        {
           case "com" : System.out.println("commercial");
           break;
           case "org" : System.out.println("organization");
           break;
           case "edu" : System.out.println("education");
           break;
           default : System.out.println("invalid");
        }
    }
}
 //to check the type of website