package first_program;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class first_project {
    public static void main(String[] args)
    {
        String name;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("what is your name");
        // name = sc.nextLine();
        // System.out.println("my name is " + name);




        // ------------------------------------------------------------------------------------------------------------------------
        // THIS IS HOW WE CAN CHECK MIN , MAX VALUE OF ANY DATA TYPE AND HOW MANY BYTES DOES IT TAKES

        // System.out.println(Float.MIN_VALUE);
        // System.out.println(Float.MAX_VALUE);
        // System.out.println(Double.BYTES);



           // ------------------------------------------------------------------------------------------------------------------------

        byte b = 123 ;
        System.out.println(b);

        int a = 234324;
        System.out.println(a);

        short c = 24211;
        System.out.println(c);

        float f = 232.2f;
        System.out.println(f);

        double d = 1232131.122321234323;
        System.out.println(d);
          

        // ------------------------------------------------------------------------------------------------------------------------
        // rules for writing variable name ,
        
        
        // here every word first letter is capital except first one
        int rollNumber = 21;
        System.out.println(rollNumber);


        // variable name can start with _ or $ but not with numbers first
        int _1 = 234;
        System.out.println(_1);


    }
}
