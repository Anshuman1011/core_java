package second_string;

import java.util.Scanner;

public class $17taskApGp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int a =0;
        int b = 1;
        int c;
        System.out.print(a + "," + b + ",");
        for(int i=0;i < n-2;i++){
            c = a + b;
            System.out.print(c + ",");
            a = b;
            b = c;
        }

        //   --------------------------------------------------   

        // int a = sc.nextInt();
        // int r = sc.nextInt();                   //GP series display
        // int n = sc.nextInt();

        // int answer=a;
        // for(int i =0;i<n;i++){
        //     System.out.print(answer + ",");
        //     answer = answer * r;
        // }

  

        //   --------------------------------------------------   

        // int a = 5;
        // int d = 5;
        // int n = sc.nextInt();                //AP series how to display

        // int answer = a;
        // for(int i =0;i<n;i++)
        // {
        //     System.out.print(answer + ",");
        //     answer = answer + d;
        // }

        //   --------------------------------------------------   

    }
}
