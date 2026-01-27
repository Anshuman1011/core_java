package first_program;

import java.util.Scanner;

public class wideningNarrowing {
    public static void main(String[] args) {
        // byte b = 10;
        // short s = 1333;
        // int i = 10;                  //in this code we are gonna convert small data type to big one
        // long l = 10;                // and big one to small called narrowing
        // float f = 10.34f;     
        // double d = 10.234;
        // char c =10;
        // boolean bl = true;

        //  b = (byte) s;
        //  System.out.println(b);

        //  int x = 10;
        //  int y = 20;
        //  System.out.println("sum of " + x + " and " + y + " is " + (x+y));

         int[]arr = {66,67,245};
         String s = new String(arr , 0 , 2);

         System.out.println( s);
    }
}
