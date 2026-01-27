package first_program;

import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("enter the breadth and height");
        // float base = sc.nextFloat();                          //AREA OF TRAINGLE FIRST FORMULA
        // float height = sc.nextFloat();

        // float area = (base * height) / 2;
        // System.out.println("the area of trinagle is " + area);

    //    ------------------------------------------------------------------

       Scanner sc = new Scanner(System.in);
       System.out.println("enter the value of a , b , c");
       float a = sc.nextFloat();
       float b = sc.nextFloat();
       float c = sc.nextFloat();

       float s = (a+b+c) /2;
       
       double area = Math.sqrt(s * (s-a) * (s-b) * (s-c) ); 
       System.out.println(area);

    }
}
